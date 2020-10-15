package analisis.vb;
import errores.ErrorG;
import java_cup.runtime.*;
import java.util.ArrayList;

%%
%{
    //coidgo de usuario en sintaxis java
    public ArrayList<ErrorG> listaErrores = new  ArrayList<>();
    public void pintar(String s){
        System.out.println(s);
    }
%}

    //directivas
%public 
%class AnalizadorLexicoVB
%cupsym SimbolosVB
%cup
%char
%line
%column
%full
%ignorecase

//%unicode

    //expreciones regulares

Signo           = [-_.!@#$%&*()+=]
Letra           = ([a-zA-Z] | ñ | Ñ)
Digito          = [0-9]
Numero          = {Digito} {Digito}*
LqSea           =  ({Signo}|{Letra}|{Numero})*
Cadena          = ("\"" [^\"]* "\"" )
Espacio         = [ \t\r]+
Siguiente       = (" _\n")+
%%




<YYINITIAL> {
    "%%VB"("\n"|"")                             {pintar(yytext()); return new Symbol(SimbolosVB.SEPARADOR_VB , yycolumn, yyline, yytext());}
    ("%%JAVA" "\n" ({LqSea}|.|"\n")*)("%%PY" "\n" ({LqSea}|.|"\n")*)("%%PROGRAMA" "\n" ({LqSea}|.|"\n")*)                 {/*pintar(yytext());*/  return new Symbol(SimbolosVB.SEPARADOR_PROGRAMA , yycolumn, yyline, yytext());}
    "\n"                                        {pintar("Salto");  return new Symbol(SimbolosVB.SALTO , yycolumn, yyline, yytext());}
    //(" _\n"|"\b_\n")                          {pintar(yytext()); return new Symbol(SimbolosVB.SALTO_SEGUIDO , yycolumn, yyline, yytext());}

    //Tipo de Datos
    "Integer"                                   {pintar(yytext()); return new Symbol(SimbolosVB.INTEGER , yycolumn, yyline, yytext());}
    ("Decimal"|"float")                                    {pintar(yytext()); return new Symbol(SimbolosVB.DECIMAL_R , yycolumn, yyline, yytext());}
    ("Chart"|"Char")                                     {pintar(yytext()); return new Symbol(SimbolosVB.CHART , yycolumn, yyline, yytext());}
    
    //Reservadas
    "&"                                         {pintar(yytext()); return new Symbol(SimbolosVB.AND_RESRV , yycolumn, yyline, yytext());}
    "And"                                       {pintar(yytext()); return new Symbol(SimbolosVB.AND , yycolumn, yyline, yytext());}
    "Or"                                        {pintar(yytext()); return new Symbol(SimbolosVB.OR , yycolumn, yyline, yytext());}
    "Not"                                       {pintar(yytext()); return new Symbol(SimbolosVB.NOT , yycolumn, yyline, yytext());}
    "Xor"                                       {pintar(yytext()); return new Symbol(SimbolosVB.XOR , yycolumn, yyline, yytext());}

    //Expresiones Aritmeticas
    "+"                                         {pintar(yytext()); return new Symbol(SimbolosVB.MAS , yycolumn, yyline, yytext());}
    "-"                                         {pintar(yytext()); return new Symbol(SimbolosVB.MENOS , yycolumn, yyline, yytext());}
    "*"                                         {pintar(yytext()); return new Symbol(SimbolosVB.POR , yycolumn, yyline, yytext());}
    "/"                                         {pintar(yytext()); return new Symbol(SimbolosVB.DIV , yycolumn, yyline, yytext());}
    "\\"                                        {pintar(yytext()); return new Symbol(SimbolosVB.DIV_ENTERO , yycolumn, yyline, yytext());}
    "^"                                         {pintar(yytext()); return new Symbol(SimbolosVB.POT , yycolumn, yyline, yytext());}
    
    //Expresiones boolenas
    "<"                                         {pintar(yytext()); return new Symbol(SimbolosVB.MENOR_QUE , yycolumn, yyline, yytext());}
    ">"                                         {pintar(yytext()); return new Symbol(SimbolosVB.MAYOR_QUE , yycolumn, yyline, yytext());}
    "<="                                        {pintar(yytext()); return new Symbol(SimbolosVB.MENOR_IGUAL , yycolumn, yyline, yytext());}
    "=<"                                        {pintar(yytext()); return new Symbol(SimbolosVB.MENOR_IGUAL , yycolumn, yyline, yytext());}
    ">="                                        {pintar(yytext()); return new Symbol(SimbolosVB.MAYOR_IGUAL , yycolumn, yyline, yytext());}
    "=>"                                        {pintar(yytext()); return new Symbol(SimbolosVB.MAYOR_IGUAL , yycolumn, yyline, yytext());}
    "="                                         {pintar(yytext()); return new Symbol(SimbolosVB.IGUAL , yycolumn, yyline, yytext());}
    "<>"                                        {pintar(yytext()); return new Symbol(SimbolosVB.DIFERENTE , yycolumn, yyline, yytext());}
    "Is"                                        {pintar(yytext()); return new Symbol(SimbolosVB.IS , yycolumn, yyline, yytext());}
    "IsNot"                                     {pintar(yytext()); return new Symbol(SimbolosVB.ISNOT , yycolumn, yyline, yytext());}
    "Like"                                      {pintar(yytext()); return new Symbol(SimbolosVB.LIKE , yycolumn, yyline, yytext());}
    
    //Comentario
    //("'"(({LqSea}|.)* (" _\n" | "\b_\n")? )* "\n")                     {pintar("Comentario: "+yytext()); return new Symbol(SimbolosVB.COMENTARIO , yycolumn, yyline, yytext());}
    ("//"({LqSea}|.)* "\n")                     {pintar("Comentario: "+yytext()); return new Symbol(SimbolosVB.COMENTARIO , yycolumn, yyline, yytext());}
    ("/*"({LqSea}|.|"\n")* "*/")                     {pintar("Comentario: "+yytext()); return new Symbol(SimbolosVB.COMENTARIO , yycolumn, yyline, yytext());}
    
    //Mensaje Pantalla
    "MsgBox("                                   {pintar("Mensaje msgbox: "+yytext()); return new Symbol(SimbolosVB.MSG , yycolumn, yyline, yytext());}
    "MessageBox("                               {pintar("Mensaje msgbox: "+yytext()); return new Symbol(SimbolosVB.MSG , yycolumn, yyline, yytext());}
    ("Console.WriteLine("|"Console.write(")                        {pintar("Mensaje console: "+yytext()); return new Symbol(SimbolosVB.CONSOLE_WRT , yycolumn, yyline, yytext());}
    "Print"                                     {pintar("Print: "+yytext()); return new Symbol(SimbolosVB.PRINT , yycolumn, yyline, yytext());}
    
    //Solicitud de Datos
    "intinput"                                  {pintar(yytext()); return new Symbol(SimbolosVB.INTINPUT , yycolumn, yyline, yytext());}
    "floatinput"                                {pintar(yytext()); return new Symbol(SimbolosVB.FLOATINPUT , yycolumn, yyline, yytext());}
    "charinput"                                 {pintar(yytext()); return new Symbol(SimbolosVB.CHARINPUT , yycolumn, yyline, yytext());}
    
    //Ciclos
        //for
    "For"                                       {pintar(yytext()); return new Symbol(SimbolosVB.FOR , yycolumn, yyline, yytext());}
    "To"                                        {pintar(yytext()); return new Symbol(SimbolosVB.TO , yycolumn, yyline, yytext());}
    "Step"                                      {pintar(yytext()); return new Symbol(SimbolosVB.STEP , yycolumn, yyline, yytext());}
    "Next"                                      {pintar(yytext()); return new Symbol(SimbolosVB.NEXT , yycolumn, yyline, yytext());}
        //while
    "While"                                     {pintar(yytext()); return new Symbol(SimbolosVB.WHILE , yycolumn, yyline, yytext());}
    "End"                                       {pintar(yytext()); return new Symbol(SimbolosVB.END , yycolumn, yyline, yytext());}
    "Do"                                        {pintar(yytext()); return new Symbol(SimbolosVB.DO , yycolumn, yyline, yytext());}
    "Until"                                     {pintar(yytext()); return new Symbol(SimbolosVB.UNTIL , yycolumn, yyline, yytext());}
    "Continue"                                  {pintar(yytext()); return new Symbol(SimbolosVB.CONTINUE , yycolumn, yyline, yytext());}
    "Exit"                                      {pintar(yytext()); return new Symbol(SimbolosVB.EXIT , yycolumn, yyline, yytext());}
    "Loop"                                      {pintar(yytext()); return new Symbol(SimbolosVB.LOOP , yycolumn, yyline, yytext());}
    ("Wend"|"End While")                                      {pintar(yytext()); return new Symbol(SimbolosVB.WEND , yycolumn, yyline, yytext());}
    
    //Condiciones
        //IF-ELSE
    ("if" | "If")                               {pintar(yytext()); return new Symbol(SimbolosVB.IF , yycolumn, yyline, yytext());}
    "Then"                                      {pintar(yytext()); return new Symbol(SimbolosVB.THEN , yycolumn, yyline, yytext());}
    "Else"                                      {pintar(yytext()); return new Symbol(SimbolosVB.ELSE , yycolumn, yyline, yytext());}
    "ElseIf"                                    {pintar(yytext()); return new Symbol(SimbolosVB.ELSE_IF , yycolumn, yyline, yytext());}
        //SWITCH
    "Select"                                    {pintar(yytext()); return new Symbol(SimbolosVB.SELECT , yycolumn, yyline, yytext());}
    "Case"                                      {pintar(yytext()); return new Symbol(SimbolosVB.CASE , yycolumn, yyline, yytext());}

    //Funciones
    "Function"                                  {pintar(yytext()); return new Symbol(SimbolosVB.FUNCTION, yycolumn, yyline, yytext());}
    "Return"                                    {pintar(yytext()); return new Symbol(SimbolosVB.RETURN , yycolumn, yyline, yytext());}

    //Modulos
    "Module"                                    {pintar(yytext()); return new Symbol(SimbolosVB.MODULE , yycolumn, yyline, yytext());}
    //Proceso
    "Sub"                                       {pintar(yytext()); return new Symbol(SimbolosVB.SUB , yycolumn, yyline, yytext());}
    

    //Declaracion de variables
    "Public"                                    {pintar(yytext()); return new Symbol(SimbolosVB.PUBLIC , yycolumn, yyline, yytext());}
    ("Dim" | "dim")                             {pintar(yytext()); return new Symbol(SimbolosVB.DIM , yycolumn, yyline, yytext());}
    "As"                                        {pintar(yytext()); return new Symbol(SimbolosVB.AS , yycolumn, yyline, yytext());}
    ({Letra})("_"| {Letra}| {Numero})*          {pintar("id: "+yytext()); return new Symbol(SimbolosVB.IDENTIFICADOR , yycolumn, yyline, yytext());}

    ({Numero}"."{Numero})                 {pintar("DECIMAL: "+yytext()); return new Symbol(SimbolosVB.DECIMAL , yycolumn, yyline, new Float(yytext()));}
    ({Numero})                            {pintar("NUMERO: "+yytext()); return new Symbol(SimbolosVB.NUMERO , yycolumn, yyline, new Integer(yytext()));}
    ("'"[^\"]"'")                        {pintar(yytext()); return new Symbol(SimbolosVB.VALOR , yycolumn, yyline, yytext());}
    {Cadena}                     {pintar("Print: "+yytext()); return new Symbol(SimbolosVB.VALOR , yycolumn, yyline, yytext());}
    
    
    {Siguiente}                                 {/*Ignore*/}
    {Espacio}                                   {/*Ignore*/}
    //"\n"                                      {pintar("salto"); return new Symbol(SimbolosVB.SALTO , yycolumn, yyline, yytext());}
    //"\""                                      {pintar("comillas"); return new Symbol(SimbolosVB.COMILLAS , yycolumn, yyline, yytext());}
    

    //"'"                                       {pintar("NUMERO: "+yytext()); return new Symbol(SimbolosVB.GL , yycolumn, yyline, yytext());}
    //":"                                       {pintar("dos puntos"); return new Symbol(SimbolosVB.DOS_PUNTOS , yycolumn, yyline, yytext());}
    "["                                         {pintar("CHORCHETE ABRE"); return new Symbol(SimbolosVB.CORCHETE_A , yycolumn, yyline, yytext());}
    "]"                                         {pintar("CORCHE CIERRE"); return new Symbol(SimbolosVB.CORCHETE_C , yycolumn, yyline, yytext());}
    "{"                                         {pintar("LLAVES ABRE"); return new Symbol(SimbolosVB.LLAVES_A , yycolumn, yyline, yytext());}
    "}"                                         {pintar("LLAVES CIEERRE"); return new Symbol(SimbolosVB.LLAVES_C , yycolumn, yyline, yytext());}
    //";"                                       {pintar("PUNTO_COMA"); return new Symbol(SimbolosVB.PUNTO_COMA , yycolumn, yyline, yytext());}
    ","                                         {pintar("COMA"); return new Symbol(SimbolosVB.COMA , yycolumn, yyline, yytext());}
    "("                                         {pintar("PARENTESIS_A"); return new Symbol(SimbolosVB.PARENTESIS_A , yycolumn, yyline, yytext());}
    ")"                                         {pintar("PARENTESIS_C"); return new Symbol(SimbolosVB.PARENTESIS_C , yycolumn, yyline, yytext());}
    //"."                                       {pintar("punto"); return new Symbol(SimbolosVB.PUNTO , yycolumn, yyline, yytext());}
    //".."                                      {pintar("PUNTO_PUNTO"); return new Symbol(SimbolosVB.PUNTO_PUNTO , yycolumn, yyline, yytext());}

    .                                           {pintar("error Lexico: "+"Columna: "+yycolumn+1+" linea: "+ yyline+1 + "Token: "+yytext());
                                                ErrorG e = new ErrorG(yytext(),yyline+1, yycolumn+1,1,"Error Lexico token: " + yytext());
                                                listaErrores.add(e);
                                    }
    
}
