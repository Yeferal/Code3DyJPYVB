package analisis.py;
import java_cup.runtime.*;
import java.util.ArrayList;

%%
%{
    //coidgo de usuario en sintaxis java
    //public ArrayList<ErrorG> listaErrores = new  ArrayList<>();
    public void pintar(String s){
        System.out.println(s);
    }
%}

    //directivas
%public 
%class AnalizadorLexicoPY
%cupsym SimbolosPY
%cup
%char
%line
%column
%full
//%ignorecase

//%unicode

    //expreciones regulares

Signo           = [-_.!@#%&*|/]
Letra           = ([a-zA-Z] | ñ | Ñ)
Digito          = [0-9]
Numero          = {Digito} {Digito}*
LqSea           =  ({Signo}|{Letra}|{Numero})*
Cadena          = ("\"" [^\"]* "\"" )
Espacio         = [ \r]
%%



<YYINITIAL> {
    ("%%VB" ("\n"|"") ({LqSea}|.|"\n")*)("%%JAVA" ("\n"|"") ({LqSea}|.|"\n")*)("%%PY" ("\n"|""))      {pintar("%%PY"); return new Symbol(SimbolosPY.SEPARADOR_PY , yycolumn, yyline, yytext());}
    ("%%PROGRAMA" ("\n"|"") ({LqSea}|.|"\n")*)                 {/*pintar(yytext());*/ return new Symbol(SimbolosPY.SEPARADOR_PROGRAMA , yycolumn, yyline, yytext());}
    

    //Reservadas
    "and"                                       {pintar(yytext()); return new Symbol(SimbolosPY.AND , yycolumn, yyline, yytext());}
    "or"                                        {pintar(yytext()); return new Symbol(SimbolosPY.OR , yycolumn, yyline, yytext());}
    "not"                                       {pintar(yytext()); return new Symbol(SimbolosPY.NOT , yycolumn, yyline, yytext());}

    //Expresiones Aritmeticas
    //"++"                                         {pintar("MAS_MAS"); return new Symbol(SimbolosPY.MAS_MAS , yycolumn, yyline, yytext());}
    "+"                                         {pintar("MAS"); return new Symbol(SimbolosPY.MAS , yycolumn, yyline, yytext());}
    //"--"                                         {pintar("MENOS_MENOS"); return new Symbol(SimbolosPY.MENOS_MENOS , yycolumn, yyline, yytext());}
    "-"                                         {pintar("MENOS"); return new Symbol(SimbolosPY.MENOS , yycolumn, yyline, yytext());}
    "**"                                         {pintar("EXPONENTE"); return new Symbol(SimbolosPY.POT , yycolumn, yyline, yytext());}
    "*"                                         {pintar("*"); return new Symbol(SimbolosPY.POR , yycolumn, yyline, yytext());}
    "//"                                         {pintar("DIV_ENTERA"); return new Symbol(SimbolosPY.DIV_ENTERA , yycolumn, yyline, yytext());}
    "/"                                         {pintar("DIV"); return new Symbol(SimbolosPY.DIV , yycolumn, yyline, yytext());}
    
    //Expresiones boolenas
    "<"                                         {pintar("MENOR_QUE"); return new Symbol(SimbolosPY.MENOR_QUE , yycolumn, yyline, yytext());}
    ">"                                         {pintar("MAYOR_QUE"); return new Symbol(SimbolosPY.MAYOR_QUE , yycolumn, yyline, yytext());}
    "<="                                        {pintar("MENOR_IGUAL"); return new Symbol(SimbolosPY.MENOR_IGUAL , yycolumn, yyline, yytext());}
    ">="                                        {pintar("MAYOR_IGUAL"); return new Symbol(SimbolosPY.MAYOR_IGUAL , yycolumn, yyline, yytext());}
    "=="                                        {pintar("IGUAL_IGUAL"); return new Symbol(SimbolosPY.IGUAL_IGUAL , yycolumn, yyline, yytext());}
    "<>"                                        {pintar("DIFERENTE"); return new Symbol(SimbolosPY.DIFERENTE , yycolumn, yyline, yytext());}
    
    //Comentario
    ("#"({LqSea}|.)* "\n")                     {pintar("Comentario: "+yytext()); return new Symbol(SimbolosPY.COMENTARIO_SIMPLE , yycolumn, yyline, yytext());}
    ("\"\"\""({LqSea}|.|"\n")* "\"\"\"")                     {pintar("Comentario: "+yytext()); return new Symbol(SimbolosPY.COMENTARIO_VARIOS , yycolumn, yyline, yytext());}
    ("//"({LqSea}|.)* "\n")                     {pintar("Comentario: "+yytext()); return new Symbol(SimbolosPY.COMENTARIO_SIMPLE , yycolumn, yyline, yytext());}
    ("/*"({LqSea}|.|"\n")* "*/")                     {pintar("Comentario: "+yytext()); return new Symbol(SimbolosPY.COMENTARIO_VARIOS , yycolumn, yyline, yytext());}


    //Mensaje Pantalla
    //"println("               {/*pintar("Mensaje ln: "+yytext()); return new Symbol(SimbolosPY.PRINT_LN , yycolumn, yyline, yytext());*/}
    "print("               {pintar("Mensaje: "+yytext()); return new Symbol(SimbolosPY.PRINT , yycolumn, yyline, yytext());}
    
    //Solicitud de Datos
    "intinput"                                  {pintar("intinput"); return new Symbol(SimbolosPY.INTINPUT , yycolumn, yyline, yytext());}
    "floatinput"                                {pintar("floarinput"); return new Symbol(SimbolosPY.FLOATINPUT , yycolumn, yyline, yytext());}
    "charinput"                                 {pintar("charinput"); return new Symbol(SimbolosPY.CHARINPUT , yycolumn, yyline, yytext());}
    
    //Ciclos
        //for
    "for"                                       {pintar("for"); return new Symbol(SimbolosPY.FOR , yycolumn, yyline, yytext());}
    "in"                                       {pintar("in"); return new Symbol(SimbolosPY.IN , yycolumn, yyline, yytext());}
    "_"                                       {pintar("_"); return new Symbol(SimbolosPY.GUION_BAJO , yycolumn, yyline, yytext());}
        //while
    "while"                                     {pintar("while"); return new Symbol(SimbolosPY.WHILE , yycolumn, yyline, yytext());}
    
    //Condiciones
        //IF-ELSE
    "if"                               {pintar(yytext()); return new Symbol(SimbolosPY.IF , yycolumn, yyline, yytext());}
    "else"                                      {pintar(yytext()); return new Symbol(SimbolosPY.ELSE , yycolumn, yyline, yytext());}
    "elif"                                      {pintar(yytext()); return new Symbol(SimbolosPY.ELSE_IF , yycolumn, yyline, yytext());}
        //SWITCH
    "break;"                                      {pintar(yytext()); return new Symbol(SimbolosPY.BREAK , yycolumn, yyline, yytext());}
    
    //Funciones
    "def"                                  {pintar(yytext()); return new Symbol(SimbolosPY.DEF, yycolumn, yyline, yytext());}
    "return"                                    {pintar(yytext()); return new Symbol(SimbolosPY.RETURN , yycolumn, yyline, yytext());}
    
    //Declaracion de variables
    //"Public"                                    {pintar(yytext()); return new Symbol(SimbolosPY.PUBLIC , yycolumn, yyline, yytext());}
    ({Letra})("_"| {Letra}| {Numero})*          {pintar("id: "+yytext()); return new Symbol(SimbolosPY.IDENTIFICADOR , yycolumn, yyline, yytext());}
    
    ({Numero}"."{Numero})                       {pintar("NUMERO: "+yytext()); return new Symbol(SimbolosPY.NUMERO , yycolumn, yyline, new Float(yytext()));}
    ({Numero})                                  {pintar("NUMERO: "+yytext()); return new Symbol(SimbolosPY.NUMERO , yycolumn, yyline, new Integer(yytext()));}
    ("'"[^\"]"'")                        {pintar(yytext()); return new Symbol(SimbolosPY.VALOR , yycolumn, yyline, yytext());}
    {Cadena}                      {pintar(yytext()); return new Symbol(SimbolosPY.TEXTO , yycolumn, yyline, yytext());}
    
    
    //{Siguiente}                                   {/*Ignore*/}
    {Espacio}                                   {/*Ignore*/}
    "\n"                                        {pintar("SALTO"); return new Symbol(SimbolosPY.SALTO , yycolumn, yyline, yytext());}
    "\t"                                        {pintar("TAB"); return new Symbol(SimbolosPY.TAB , yycolumn, yyline, yytext());}
    \t                                        {pintar("TAB"); return new Symbol(SimbolosPY.TAB , yycolumn, yyline, yytext());}
    //"   "                                        {pintar("TAB"); return new Symbol(SimbolosPY.TAB , yycolumn, yyline, yytext());}
    "    "                                        {pintar("TAB"); return new Symbol(SimbolosPY.TAB , yycolumn, yyline, yytext());}
    //"\b\b\b\b"                                        {pintar("TAB"); return new Symbol(SimbolosPY.TAB , yycolumn, yyline, yytext());}
    //"      "                                        {pintar("TAB"); return new Symbol(SimbolosPY.TAB , yycolumn, yyline, yytext());}
    //"\""                                        {pintar("comillas"); return new Symbol(SimbolosPY.COMILLAS , yycolumn, yyline, yytext());}
    
    "="                                        {pintar("IGUAL"); return new Symbol(SimbolosPY.IGUAL , yycolumn, yyline, yytext());}
    //"'"                                         {pintar("NUMERO: "+yytext()); return new Symbol(SimbolosPY_GL , yycolumn, yyline, yytext());}
    ":"                                         {pintar("dos puntos"); return new Symbol(SimbolosPY.DOS_PUNTOS , yycolumn, yyline, yytext());}
    "["                                         {pintar("CHORCHETE ABRE"); return new Symbol(SimbolosPY.CORCHETE_A , yycolumn, yyline, yytext());}
    "]"                                         {pintar("CORCHE CIERRE"); return new Symbol(SimbolosPY.CORCHETE_C , yycolumn, yyline, yytext());}
    "{"                                         {pintar("LLAVES ABRE"); return new Symbol(SimbolosPY.LLAVES_A , yycolumn, yyline, yytext());}
    "}"                                         {pintar("LLAVES CIEERRE"); return new Symbol(SimbolosPY.LLAVES_C , yycolumn, yyline, yytext());}
    //";"                                         {pintar("PUNTO_COMA"); return new Symbol(SimbolosPY.PUNTO_COMA , yycolumn, yyline, yytext());}
    ","                                         {pintar("COMA"); return new Symbol(SimbolosPY.COMA , yycolumn, yyline, yytext());}
    "("                                         {pintar("PARENTESIS_A"); return new Symbol(SimbolosPY.PARENTESIS_A , yycolumn, yyline, yytext());}
    ")"                                         {pintar("PARENTESIS_C"); return new Symbol(SimbolosPY.PARENTESIS_C , yycolumn, yyline, yytext());}
    //"."                                         {pintar("punto"); return new Symbol(SimbolosPY.PUNTO , yycolumn, yyline, yytext());}
    //".."                                        {pintar("PUNTO_PUNTO"); return new Symbol(SimbolosPY.PUNTO_PUNTO , yycolumn, yyline, yytext());}

    .                               {pintar("error Lexico: "+"Columna: "+yycolumn+1+" linea: "+ yyline+1 + "Token: "+yytext());
                                    /*ErrorG e = new ErrorG(yyline+1, yycolumn+1,yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + (yyline+1) + " ,    Columna: " + (yycolumn+1));
                                    listaErrores.add(e);*/
                                    }
    
}