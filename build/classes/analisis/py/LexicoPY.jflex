package analisis.py;
import java_cup.runtime.*;
import java.util.ArrayList;

%%
%{
    //coidgo de usuario en sintaxis java
    //public ArrayList<ErrorG> listaErrores = new  ArrayList<>();

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
Espacio         = [ \b\r]+
%%



<YYINITIAL> {
    ("%%VB" ("\n"|"") ({LqSea}|.|"\n")*)("%%JAVA" ("\n"|"") ({LqSea}|.|"\n")*)("%%PY" ("\n"|""))      {System.out.println(yytext()); return new Symbol(SimbolosPY.SEPARADOR_PY , yycolumn, yyline, yytext());}
    ("%%PROGRAMA" ("\n"|"") ({LqSea}|.|"\n")*)                 {System.out.println(yytext()); return new Symbol(SimbolosPY.SEPARADOR_PROGRAMA , yycolumn, yyline, yytext());}
    

    //Reservadas
    "and"                                       {System.out.println(yytext()); return new Symbol(SimbolosPY.AND , yycolumn, yyline, yytext());}
    "or"                                        {System.out.println(yytext()); return new Symbol(SimbolosPY.OR , yycolumn, yyline, yytext());}
    "not"                                       {System.out.println(yytext()); return new Symbol(SimbolosPY.NOT , yycolumn, yyline, yytext());}

    //Expresiones Aritmeticas
    //"++"                                         {System.out.println("MAS_MAS"); return new Symbol(SimbolosPY.MAS_MAS , yycolumn, yyline, yytext());}
    "+"                                         {System.out.println("MAS"); return new Symbol(SimbolosPY.MAS , yycolumn, yyline, yytext());}
    //"--"                                         {System.out.println("MENOS_MENOS"); return new Symbol(SimbolosPY.MENOS_MENOS , yycolumn, yyline, yytext());}
    "-"                                         {System.out.println("MENOS"); return new Symbol(SimbolosPY.MENOS , yycolumn, yyline, yytext());}
    "**"                                         {System.out.println("EXPONENTE"); return new Symbol(SimbolosPY.POT , yycolumn, yyline, yytext());}
    "*"                                         {System.out.println("*"); return new Symbol(SimbolosPY.POR , yycolumn, yyline, yytext());}
    "//"                                         {System.out.println("DIV_ENTERA"); return new Symbol(SimbolosPY.DIV_ENTERA , yycolumn, yyline, yytext());}
    "/"                                         {System.out.println("DIV"); return new Symbol(SimbolosPY.DIV , yycolumn, yyline, yytext());}
    
    //Expresiones boolenas
    "<"                                         {System.out.println("MENOR_QUE"); return new Symbol(SimbolosPY.MENOR_QUE , yycolumn, yyline, yytext());}
    ">"                                         {System.out.println("MAYOR_QUE"); return new Symbol(SimbolosPY.MAYOR_QUE , yycolumn, yyline, yytext());}
    "<="                                        {System.out.println("MENOR_IGUAL"); return new Symbol(SimbolosPY.MENOR_IGUAL , yycolumn, yyline, yytext());}
    ">="                                        {System.out.println("MAYOR_IGUAL"); return new Symbol(SimbolosPY.MAYOR_IGUAL , yycolumn, yyline, yytext());}
    "=="                                        {System.out.println("IGUAL_IGUAL"); return new Symbol(SimbolosPY.IGUAL_IGUAL , yycolumn, yyline, yytext());}
    "<>"                                        {System.out.println("DIFERENTE"); return new Symbol(SimbolosPY.DIFERENTE , yycolumn, yyline, yytext());}
    
    //Comentario
    ("#"({LqSea}|.)* "\n")                     {System.out.println("Comentario: "+yytext()); return new Symbol(SimbolosPY.COMENTARIO_SIMPLE , yycolumn, yyline, yytext());}
    ("\"\"\""({LqSea}|.|"\n")* "\"\"\"")                     {System.out.println("Comentario: "+yytext()); return new Symbol(SimbolosPY.COMENTARIO_VARIOS , yycolumn, yyline, yytext());}


    //Mensaje Pantalla
    //"println("               {/*System.out.println("Mensaje ln: "+yytext()); return new Symbol(SimbolosPY.PRINT_LN , yycolumn, yyline, yytext());*/}
    "print("               {System.out.println("Mensaje: "+yytext()); return new Symbol(SimbolosPY.PRINT , yycolumn, yyline, yytext());}
    
    //Solicitud de Datos
    "intinput"                                  {System.out.println("intinput"); return new Symbol(SimbolosPY.INTINPUT , yycolumn, yyline, yytext());}
    "floatinput"                                {System.out.println("floarinput"); return new Symbol(SimbolosPY.FLOATINPUT , yycolumn, yyline, yytext());}
    "charinput"                                 {System.out.println("charinput"); return new Symbol(SimbolosPY.CHARINPUT , yycolumn, yyline, yytext());}
    
    //Ciclos
        //for
    "for"                                       {System.out.println("for"); return new Symbol(SimbolosPY.FOR , yycolumn, yyline, yytext());}
    "in"                                       {System.out.println("in"); return new Symbol(SimbolosPY.IN , yycolumn, yyline, yytext());}
    "_"                                       {System.out.println("_"); return new Symbol(SimbolosPY.GUION_BAJO , yycolumn, yyline, yytext());}
        //while
    "while"                                     {System.out.println("while"); return new Symbol(SimbolosPY.WHILE , yycolumn, yyline, yytext());}
    
    //Condiciones
        //IF-ELSE
    "if"                               {System.out.println(yytext()); return new Symbol(SimbolosPY.IF , yycolumn, yyline, yytext());}
    "else"                                      {System.out.println(yytext()); return new Symbol(SimbolosPY.ELSE , yycolumn, yyline, yytext());}
    "elif"                                      {System.out.println(yytext()); return new Symbol(SimbolosPY.ELSE_IF , yycolumn, yyline, yytext());}
        //SWITCH
    "break;"                                      {System.out.println(yytext()); return new Symbol(SimbolosPY.BREAK , yycolumn, yyline, yytext());}
    
    //Funciones
    "def"                                  {System.out.println(yytext()); return new Symbol(SimbolosPY.DEF, yycolumn, yyline, yytext());}
    "return"                                    {System.out.println(yytext()); return new Symbol(SimbolosPY.RETURN , yycolumn, yyline, yytext());}
    
    //Declaracion de variables
    //"Public"                                    {System.out.println(yytext()); return new Symbol(SimbolosPY.PUBLIC , yycolumn, yyline, yytext());}
    ({Letra})("_"| {Letra}| {Numero})*          {System.out.println("id: "+yytext()); return new Symbol(SimbolosPY.IDENTIFICADOR , yycolumn, yyline, yytext());}
    
    ({Numero}"."{Numero})                       {System.out.println("NUMERO: "+yytext()); return new Symbol(SimbolosPY.NUMERO , yycolumn, yyline, yytext());}
    ({Numero})                                  {System.out.println("NUMERO: "+yytext()); return new Symbol(SimbolosPY.NUMERO , yycolumn, yyline, yytext());}
    ("'"({LqSea}|.)"'")                        {System.out.println(yytext()); return new Symbol(SimbolosPY.VALOR , yycolumn, yyline, yytext());}
    ("\""({LqSea}|.)*"\"")                      {System.out.println(yytext()); return new Symbol(SimbolosPY.TEXTO , yycolumn, yyline, yytext());}
    
    
    //{Siguiente}                                   {/*Ignore*/}
    {Espacio}                                   {/*Ignore*/}
    "\n"                                        {System.out.println("SALTO"); return new Symbol(SimbolosPY.SALTO , yycolumn, yyline, yytext());}
    "\t"                                        {System.out.println("TAB"); return new Symbol(SimbolosPY.TAB , yycolumn, yyline, yytext());}
    //"\""                                        {System.out.println("comillas"); return new Symbol(SimbolosPY.COMILLAS , yycolumn, yyline, yytext());}
    
    "="                                        {System.out.println("IGUAL"); return new Symbol(SimbolosPY.IGUAL , yycolumn, yyline, yytext());}
    //"'"                                         {System.out.println("NUMERO: "+yytext()); return new Symbol(SimbolosPY_GL , yycolumn, yyline, yytext());}
    ":"                                         {System.out.println("dos puntos"); return new Symbol(SimbolosPY.DOS_PUNTOS , yycolumn, yyline, yytext());}
    "["                                         {System.out.println("CHORCHETE ABRE"); return new Symbol(SimbolosPY.CORCHETE_A , yycolumn, yyline, yytext());}
    "]"                                         {System.out.println("CORCHE CIERRE"); return new Symbol(SimbolosPY.CORCHETE_C , yycolumn, yyline, yytext());}
    "{"                                         {System.out.println("LLAVES ABRE"); return new Symbol(SimbolosPY.LLAVES_A , yycolumn, yyline, yytext());}
    "}"                                         {System.out.println("LLAVES CIEERRE"); return new Symbol(SimbolosPY.LLAVES_C , yycolumn, yyline, yytext());}
    //";"                                         {System.out.println("PUNTO_COMA"); return new Symbol(SimbolosPY.PUNTO_COMA , yycolumn, yyline, yytext());}
    ","                                         {System.out.println("COMA"); return new Symbol(SimbolosPY.COMA , yycolumn, yyline, yytext());}
    "("                                         {System.out.println("PARENTESIS_A"); return new Symbol(SimbolosPY.PARENTESIS_A , yycolumn, yyline, yytext());}
    ")"                                         {System.out.println("PARENTESIS_C"); return new Symbol(SimbolosPY.PARENTESIS_C , yycolumn, yyline, yytext());}
    //"."                                         {System.out.println("punto"); return new Symbol(SimbolosPY.PUNTO , yycolumn, yyline, yytext());}
    //".."                                        {System.out.println("PUNTO_PUNTO"); return new Symbol(SimbolosPY.PUNTO_PUNTO , yycolumn, yyline, yytext());}

    .                               {System.out.println("error Lexico: "+"Columna: "+yycolumn+1+" linea: "+ yyline+1 + "Token: "+yytext());
                                    /*ErrorG e = new ErrorG(yyline+1, yycolumn+1,yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + (yyline+1) + " ,    Columna: " + (yycolumn+1));
                                    listaErrores.add(e);*/
                                    }
    
}