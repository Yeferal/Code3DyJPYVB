package analisis.vb;
import java_cup.runtime.*;
import java.util.ArrayList;

%%
%{
    //coidgo de usuario en sintaxis java
    //public ArrayList<ErrorG> listaErrores = new  ArrayList<>();

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

Signo           = [-_.!@#%&*|/]
Letra           = ([a-zA-Z] | ñ | Ñ)
Digito          = [0-9]
Numero          = {Digito} {Digito}*
LqSea           =  ({Signo}|{Letra}|{Numero})*
Espacio         = [ \t\r\n]+
Siguiente       = (" _\n")+
%%




<YYINITIAL> {
    "%%VB"                                      {System.out.println(yytext()); return new Symbol(SimbolosVB.SEPARADOR_VB , yycolumn, yyline, yytext());}
    ("%%JAVA" ({LqSea}|.)*)                     {System.out.println(yytext()); return new Symbol(SimbolosVB.SEPARADOR_JAVA , yycolumn, yyline, yytext());}
    ("%%PY" ({LqSea}|.)*)                       {System.out.println(yytext()); return new Symbol(SimbolosVB.SEPARADOR_PY , yycolumn, yyline, yytext());}
    ("%%PROGRAMA" ({LqSea}|.)*)                 {System.out.println(yytext()); return new Symbol(SimbolosVB.SEPARADOR_PROGRAMA , yycolumn, yyline, yytext());}
    "\n"                                        {System.out.println(yytext()); return new Symbol(SimbolosVB.SALTO , yycolumn, yyline, yytext());}
    //(" _\n"|"\b_\n")                            {System.out.println(yytext()); return new Symbol(SimbolosVB.SALTO_SEGUIDO , yycolumn, yyline, yytext());}

    //Tipo de Datos
    "Integer"                                   {System.out.println(yytext()); return new Symbol(SimbolosVB.INTEGER , yycolumn, yyline, yytext());}
    "Decimal"                                   {System.out.println(yytext()); return new Symbol(SimbolosVB.DECIMAL_R , yycolumn, yyline, yytext());}
    "Chart"                                     {System.out.println(yytext()); return new Symbol(SimbolosVB.CHART , yycolumn, yyline, yytext());}
    
    //Reservadas
    "&"                                         {System.out.println(yytext()); return new Symbol(SimbolosVB.AND_RESRV , yycolumn, yyline, yytext());}
    "And"                                       {System.out.println(yytext()); return new Symbol(SimbolosVB.AND , yycolumn, yyline, yytext());}
    "Or"                                        {System.out.println(yytext()); return new Symbol(SimbolosVB.OR , yycolumn, yyline, yytext());}
    "Not"                                       {System.out.println(yytext()); return new Symbol(SimbolosVB.NOT , yycolumn, yyline, yytext());}
    "Xor"                                       {System.out.println(yytext()); return new Symbol(SimbolosVB.XOR , yycolumn, yyline, yytext());}

    //Expresiones Aritmeticas
    "+"                                         {System.out.println("MAS"); return new Symbol(SimbolosVB.MAS , yycolumn, yyline, yytext());}
    "-"                                         {System.out.println("MENOS"); return new Symbol(SimbolosVB.MENOS , yycolumn, yyline, yytext());}
    "*"                                         {System.out.println("ASTERISCO"); return new Symbol(SimbolosVB.POR , yycolumn, yyline, yytext());}
    "/"                                         {System.out.println("DIV"); return new Symbol(SimbolosVB.DIV , yycolumn, yyline, yytext());}
    "\\"                                        {System.out.println("DIV ENTERO"); return new Symbol(SimbolosVB.DIV_ENTERO , yycolumn, yyline, yytext());}
    "^"                                        {System.out.println("POT"); return new Symbol(SimbolosVB.POT , yycolumn, yyline, yytext());}
    
    //Expresiones boolenas
    "<"                                         {System.out.println("MENOR_QUE"); return new Symbol(SimbolosVB.MENOR_QUE , yycolumn, yyline, yytext());}
    ">"                                         {System.out.println("MAYOR_QUE"); return new Symbol(SimbolosVB.MAYOR_QUE , yycolumn, yyline, yytext());}
    "<="                                        {System.out.println("MENOR_IGUAL"); return new Symbol(SimbolosVB.MENOR_IGUAL , yycolumn, yyline, yytext());}
    "=<"                                        {System.out.println("MENOR_IGUAL"); return new Symbol(SimbolosVB.MENOR_IGUAL , yycolumn, yyline, yytext());}
    ">="                                        {System.out.println("MAYOR_IGUAL"); return new Symbol(SimbolosVB.MAYOR_IGUAL , yycolumn, yyline, yytext());}
    "=>"                                        {System.out.println("MAYOR_IGUAL"); return new Symbol(SimbolosVB.MAYOR_IGUAL , yycolumn, yyline, yytext());}
    "="                                        {System.out.println("IGUAL"); return new Symbol(SimbolosVB.IGUAL , yycolumn, yyline, yytext());}
    "<>"                                        {System.out.println("DIFERENTE"); return new Symbol(SimbolosVB.DIFERENTE , yycolumn, yyline, yytext());}
    "Is"                                        {System.out.println("Is"); return new Symbol(SimbolosVB.IS , yycolumn, yyline, yytext());}
    "IsNot"                                        {System.out.println("IsNot"); return new Symbol(SimbolosVB.ISNOT , yycolumn, yyline, yytext());}
    "Like"                                        {System.out.println("Like"); return new Symbol(SimbolosVB.LIKE , yycolumn, yyline, yytext());}
    
    //Comentario
    ("'"(({LqSea}|.)* (" _\n" | "\b_\n")? )* "\n")                     {System.out.println("Comentario: "+yytext()); return new Symbol(SimbolosVB.COMENTARIO , yycolumn, yyline, yytext());}
    
    //Mensaje Pantalla
    ("MsgBox(" ({LqSea}|.)* ")")               {System.out.println("Mensaje msgbox"); return new Symbol(SimbolosVB.MSG , yycolumn, yyline, yytext());}
    //("MessageBox(" (({LqSea}|.)* ")")         {System.out.println("Mensaje msgbox"); return new Symbol(SimbolosVB.MSG , yycolumn, yyline, yytext());}
    ("Console.WriteLine(" ({LqSea}|.)* ")")    {System.out.println("Mensaje console"); return new Symbol(SimbolosVB.CONSOLE_WRT , yycolumn, yyline, yytext());}
    
    //Solicitud de Datos
    "intinput"                                  {System.out.println("intinput"); return new Symbol(SimbolosVB.INTINPUT , yycolumn, yyline, yytext());}
    "floatinput"                                {System.out.println("floarinput"); return new Symbol(SimbolosVB.FLOATINPUT , yycolumn, yyline, yytext());}
    "charinput"                                 {System.out.println("charinput"); return new Symbol(SimbolosVB.CHARINPUT , yycolumn, yyline, yytext());}
    
    //Ciclos
        //for
    "For"                                       {System.out.println("For"); return new Symbol(SimbolosVB.FOR , yycolumn, yyline, yytext());}
    "To"                                        {System.out.println("To"); return new Symbol(SimbolosVB.TO , yycolumn, yyline, yytext());}
    "Step"                                      {System.out.println("Step"); return new Symbol(SimbolosVB.STEP , yycolumn, yyline, yytext());}
    "Next"                                      {System.out.println("Next"); return new Symbol(SimbolosVB.NEXT , yycolumn, yyline, yytext());}
        //while
    "While"                                     {System.out.println("While"); return new Symbol(SimbolosVB.WHILE , yycolumn, yyline, yytext());}
    "End"                                       {System.out.println("End"); return new Symbol(SimbolosVB.END , yycolumn, yyline, yytext());}
    "Do"                                        {System.out.println("Do"); return new Symbol(SimbolosVB.DO , yycolumn, yyline, yytext());}
    "Until"                                     {System.out.println("Until"); return new Symbol(SimbolosVB.UNTIL , yycolumn, yyline, yytext());}
    "Continue"                                  {System.out.println("Continue"); return new Symbol(SimbolosVB.CONTINUE , yycolumn, yyline, yytext());}
    "Exit"                                      {System.out.println("Exit"); return new Symbol(SimbolosVB.EXIT , yycolumn, yyline, yytext());}
    "Loop"                                      {System.out.println("Loop"); return new Symbol(SimbolosVB.LOOP , yycolumn, yyline, yytext());}
    "Wend"                                      {System.out.println(yytext()); return new Symbol(SimbolosVB.WEND , yycolumn, yyline, yytext());}
    
    //Condiciones
        //IF-ELSE
    ("if" | "If")                               {System.out.println(yytext()); return new Symbol(SimbolosVB.IF , yycolumn, yyline, yytext());}
    "Then"                                      {System.out.println(yytext()); return new Symbol(SimbolosVB.THEN , yycolumn, yyline, yytext());}
    "Else"                                      {System.out.println(yytext()); return new Symbol(SimbolosVB.ELSE , yycolumn, yyline, yytext());}
    "ElseIf"                                    {System.out.println(yytext()); return new Symbol(SimbolosVB.ELSE_IF , yycolumn, yyline, yytext());}
        //SWITCH
    "Select"                                    {System.out.println(yytext()); return new Symbol(SimbolosVB.SELECT , yycolumn, yyline, yytext());}
    "Case"                                      {System.out.println(yytext()); return new Symbol(SimbolosVB.CASE , yycolumn, yyline, yytext());}

    //Funciones
    "Function"                                  {System.out.println(yytext()); return new Symbol(SimbolosVB.FUNCTION, yycolumn, yyline, yytext());}
    "Return"                                    {System.out.println(yytext()); return new Symbol(SimbolosVB.RETURN , yycolumn, yyline, yytext());}

    //Modulos
    "Module"                                    {System.out.println(yytext()); return new Symbol(SimbolosVB.MODULE , yycolumn, yyline, yytext());}
    //Proceso
    "Sub"                                       {System.out.println(yytext()); return new Symbol(SimbolosVB.SUB , yycolumn, yyline, yytext());}
    

    //Declaracion de variables
    "Public"                                    {System.out.println(yytext()); return new Symbol(SimbolosVB.PUBLIC , yycolumn, yyline, yytext());}
    ("Dim" | "dim")                                      {System.out.println(yytext()); return new Symbol(SimbolosVB.DIM , yycolumn, yyline, yytext());}
    "As"                                        {System.out.println(yytext()); return new Symbol(SimbolosVB.AS , yycolumn, yyline, yytext());}
    ({Letra})("_"| {Letra}| {Numero})*          {System.out.println("id: "+yytext()); return new Symbol(SimbolosVB.IDENTIFICADOR , yycolumn, yyline, yytext());}

    (("-")?{Numero}"."{Numero})                       {System.out.println("DECIMAL: "+yytext()); return new Symbol(SimbolosVB.DECIMAL , yycolumn, yyline, yytext());}
    (("-")?{Numero})                                  {System.out.println("NUMERO: "+yytext()); return new Symbol(SimbolosVB.NUMERO , yycolumn, yyline, yytext());}
    ("'"({LqSea}|.)*"'")                        {System.out.println(yytext()); return new Symbol(SimbolosVB.VALOR , yycolumn, yyline, yytext());}
    ("\""({LqSea}|.)*"\"")                      {System.out.println(yytext()); return new Symbol(SimbolosVB.VALOR , yycolumn, yyline, yytext());}
    
    
    {Siguiente}                                   {/*Ignore*/}
    {Espacio}                                   {/*Ignore*/}
    //"\n"                                       {System.out.println("salto"); return new Symbol(SimbolosVB.SALTO , yycolumn, yyline, yytext());}
    //"\""                                        {System.out.println("comillas"); return new Symbol(SimbolosVB.COMILLAS , yycolumn, yyline, yytext());}
    

    //"'"                                         {System.out.println("NUMERO: "+yytext()); return new Symbol(SimbolosVB.GL , yycolumn, yyline, yytext());}
    //":"                                         {System.out.println("dos puntos"); return new Symbol(SimbolosVB.DOS_PUNTOS , yycolumn, yyline, yytext());}
    "["                                         {System.out.println("CHORCHETE ABRE"); return new Symbol(SimbolosVB.CORCHETE_A , yycolumn, yyline, yytext());}
    "]"                                         {System.out.println("CORCHE CIERRE"); return new Symbol(SimbolosVB.CORCHETE_C , yycolumn, yyline, yytext());}
    "{"                                         {System.out.println("LLAVES ABRE"); return new Symbol(SimbolosVB.LLAVES_A , yycolumn, yyline, yytext());}
    "}"                                         {System.out.println("LLAVES CIEERRE"); return new Symbol(SimbolosVB.LLAVES_C , yycolumn, yyline, yytext());}
    //";"                                         {System.out.println("PUNTO_COMA"); return new Symbol(SimbolosVB.PUNTO_COMA , yycolumn, yyline, yytext());}
    ","                                         {System.out.println("COMA"); return new Symbol(SimbolosVB.COMA , yycolumn, yyline, yytext());}
    "("                                         {System.out.println("PARENTESIS_A"); return new Symbol(SimbolosVB.PARENTESIS_A , yycolumn, yyline, yytext());}
    ")"                                         {System.out.println("PARENTESIS_C"); return new Symbol(SimbolosVB.PARENTESIS_C , yycolumn, yyline, yytext());}
    //"."                                         {System.out.println("punto"); return new Symbol(SimbolosVB.PUNTO , yycolumn, yyline, yytext());}
    //".."                                        {System.out.println("PUNTO_PUNTO"); return new Symbol(SimbolosVB.PUNTO_PUNTO , yycolumn, yyline, yytext());}
    



    .                               {System.out.println("error Lexico: "+"Columna: "+yycolumn+1+" linea: "+ yyline+1 + "Token: "+yytext());
                                    /*ErrorG e = new ErrorG(yyline+1, yycolumn+1,yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + (yyline+1) + " ,    Columna: " + (yycolumn+1));
                                    listaErrores.add(e);*/
                                    }
    
}
