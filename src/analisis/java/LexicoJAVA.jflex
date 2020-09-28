package analisis.java;
import java_cup.runtime.*;
import java.util.ArrayList;

%%
%{
    //coidgo de usuario en sintaxis java
    //public ArrayList<ErrorG> listaErrores = new  ArrayList<>();

%}

    //directivas
%public 
%class AnalizadorLexicoJAVA
%cupsym SimbolosJAVA
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
Espacio         = [ \t\r\n]+
%%




<YYINITIAL> {
    ("%%VB" ({LqSea}|.|"\n")*)("%%JAVA")                                    {System.out.println(yytext()); return new Symbol(SimbolosJAVA.SEPARADOR_JAVA , yycolumn, yyline, yytext());}
    //("%%VB" ({LqSea}|.|"")*)("%%JAVA")                                      {System.out.println(yytext()); return new Symbol(SimbolosJAVA.SEPARADOR_JAVA , yycolumn, yyline, yytext());}
    ("%%PY" ({LqSea}|.|"\n")*)("%%PROGRAMA" ({LqSea}|.|"\n")*)                    {System.out.println(yytext()); return new Symbol(SimbolosJAVA.SEPARADOR_PROGRAMA , yycolumn, yyline, yytext());}
    
    //Tipo de Datos
    "class"                                   {System.out.println(yytext()); return new Symbol(SimbolosJAVA.CLASS , yycolumn, yyline, yytext());}
    "int"                                   {System.out.println(yytext()); return new Symbol(SimbolosJAVA.INT , yycolumn, yyline, yytext());}
    "float"                                   {System.out.println(yytext()); return new Symbol(SimbolosJAVA.FLOAT , yycolumn, yyline, yytext());}
    "char"                                     {System.out.println(yytext()); return new Symbol(SimbolosJAVA.CHAR , yycolumn, yyline, yytext());}
    
    //Reservadas
    "&&"                                       {System.out.println(yytext()); return new Symbol(SimbolosJAVA.AND , yycolumn, yyline, yytext());}
    "||"                                        {System.out.println(yytext()); return new Symbol(SimbolosJAVA.OR , yycolumn, yyline, yytext());}
    "!"                                       {System.out.println(yytext()); return new Symbol(SimbolosJAVA.NOT , yycolumn, yyline, yytext());}
    //"%"                                       {System.out.println(yytext()); return new Symbol(SimbolosJAVA.NOT , yycolumn, yyline, yytext());}

    //Expresiones Aritmeticas
    "++"                                         {System.out.println("MAS_MAS"); return new Symbol(SimbolosJAVA.MAS_MAS , yycolumn, yyline, yytext());}
    "+"                                         {System.out.println("MAS"); return new Symbol(SimbolosJAVA.MAS , yycolumn, yyline, yytext());}
    "--"                                         {System.out.println("MENOS_MENOS"); return new Symbol(SimbolosJAVA.MENOS_MENOS , yycolumn, yyline, yytext());}
    "-"                                         {System.out.println("MENOS"); return new Symbol(SimbolosJAVA.MENOS , yycolumn, yyline, yytext());}
    "*"                                         {System.out.println("ASTERISCO"); return new Symbol(SimbolosJAVA.POR , yycolumn, yyline, yytext());}
    "/"                                         {System.out.println("DIV"); return new Symbol(SimbolosJAVA.DIV , yycolumn, yyline, yytext());}
    
    //Expresiones boolenas
    "<"                                         {System.out.println("MENOR_QUE"); return new Symbol(SimbolosJAVA.MENOR_QUE , yycolumn, yyline, yytext());}
    ">"                                         {System.out.println("MAYOR_QUE"); return new Symbol(SimbolosJAVA.MAYOR_QUE , yycolumn, yyline, yytext());}
    "<="                                        {System.out.println("MENOR_IGUAL"); return new Symbol(SimbolosJAVA.MENOR_IGUAL , yycolumn, yyline, yytext());}
    ">="                                        {System.out.println("MAYOR_IGUAL"); return new Symbol(SimbolosJAVA.MAYOR_IGUAL , yycolumn, yyline, yytext());}
    "=="                                        {System.out.println("IGUAL_IGUAL"); return new Symbol(SimbolosJAVA.IGUAL_IGUAL , yycolumn, yyline, yytext());}
    "!="                                        {System.out.println("DIFERENTE"); return new Symbol(SimbolosJAVA.DIFERENTE , yycolumn, yyline, yytext());}
    
    //Comentario
    ("//"({LqSea}|.)* "\n")                     {System.out.println("Comentario: "+yytext()); return new Symbol(SimbolosJAVA.COMENTARIO_SIMPLE , yycolumn, yyline, yytext());}
    ("/*"({LqSea}|.|"\n")* "*/")                     {System.out.println("Comentario: "+yytext()); return new Symbol(SimbolosJAVA.COMENTARIO_VARIOS , yycolumn, yyline, yytext());}
    
    //Mensaje Pantalla
    "System.out.println("               {System.out.println("Mensaje SOUT: "+yytext()); return new Symbol(SimbolosJAVA.SOUT , yycolumn, yyline, yytext());}
    
    //Solicitud de Datos
    "intinput"                                  {System.out.println("intinput"); return new Symbol(SimbolosJAVA.INTINPUT , yycolumn, yyline, yytext());}
    "floatinput"                                {System.out.println("floarinput"); return new Symbol(SimbolosJAVA.FLOATINPUT , yycolumn, yyline, yytext());}
    "charinput"                                 {System.out.println("charinput"); return new Symbol(SimbolosJAVA.CHARINPUT , yycolumn, yyline, yytext());}
    
    //Ciclos
        //for
    "for"                                       {System.out.println("for"); return new Symbol(SimbolosJAVA.FOR , yycolumn, yyline, yytext());}
        //while
    "while"                                     {System.out.println("while"); return new Symbol(SimbolosJAVA.WHILE , yycolumn, yyline, yytext());}
    "do"                                     {System.out.println("do"); return new Symbol(SimbolosJAVA.DO , yycolumn, yyline, yytext());}
    
    //Condiciones
        //IF-ELSE
    "if"                               {System.out.println(yytext()); return new Symbol(SimbolosJAVA.IF , yycolumn, yyline, yytext());}
    "else"                                      {System.out.println(yytext()); return new Symbol(SimbolosJAVA.ELSE , yycolumn, yyline, yytext());}
        //SWITCH
    "switch"                                    {System.out.println(yytext()); return new Symbol(SimbolosJAVA.SWITCH , yycolumn, yyline, yytext());}
    "case"                                      {System.out.println(yytext()); return new Symbol(SimbolosJAVA.CASE , yycolumn, yyline, yytext());}
    "break;"                                      {System.out.println(yytext()); return new Symbol(SimbolosJAVA.BREAK , yycolumn, yyline, yytext());}
    "default:"                                      {System.out.println(yytext()); return new Symbol(SimbolosJAVA.DEFAULT , yycolumn, yyline, yytext());}
    
    //Funciones
    "void"                                  {System.out.println(yytext()); return new Symbol(SimbolosJAVA.VOID, yycolumn, yyline, yytext());}
    "return"                                    {System.out.println(yytext()); return new Symbol(SimbolosJAVA.RETURN , yycolumn, yyline, yytext());}
    
    //Declaracion de variables
    "public"                                    {System.out.println(yytext()); return new Symbol(SimbolosJAVA.PUBLIC , yycolumn, yyline, yytext());}
    ({Letra})("_"| {Letra}| {Numero})*          {System.out.println("id: "+yytext()); return new Symbol(SimbolosJAVA.IDENTIFICADOR , yycolumn, yyline, yytext());}
    
    (("-")?{Numero}"."{Numero})                       {System.out.println("DECIMAL: "+yytext()); return new Symbol(SimbolosJAVA.DECIMAL , yycolumn, yyline, yytext());}
    (("-")?{Numero})                                  {System.out.println("NUMERO: "+yytext()); return new Symbol(SimbolosJAVA.NUMERO , yycolumn, yyline, yytext());}
    ("'"({LqSea}|.)"'")                        {System.out.println(yytext()); return new Symbol(SimbolosJAVA.VALOR , yycolumn, yyline, yytext());}
    ("\""({LqSea}|.)*"\"")                      {System.out.println("texto"+yytext()); return new Symbol(SimbolosJAVA.TEXTO , yycolumn, yyline, yytext());}
    
    {Espacio}                                   {/*Ignore*/}
    //"\n"                                       {System.out.println("salto"); return new Symbol(SimbolosJAVA.SALTO , yycolumn, yyline, yytext());}
    //"\""                                        {System.out.println("comillas"); return new Symbol(SimbolosJAVA.COMILLAS , yycolumn, yyline, yytext());}
    
    "="                                        {System.out.println("IGUAL"); return new Symbol(SimbolosJAVA.IGUAL , yycolumn, yyline, yytext());}
    //"'"                                         {System.out.println("NUMERO: "+yytext()); return new Symbol(SimbolosJAVA.GL , yycolumn, yyline, yytext());}
    ":"                                         {System.out.println("dos puntos"); return new Symbol(SimbolosJAVA.DOS_PUNTOS , yycolumn, yyline, yytext());}
    "["                                         {System.out.println("CHORCHETE ABRE"); return new Symbol(SimbolosJAVA.CORCHETE_A , yycolumn, yyline, yytext());}
    "]"                                         {System.out.println("CORCHE CIERRE"); return new Symbol(SimbolosJAVA.CORCHETE_C , yycolumn, yyline, yytext());}
    "{"                                         {System.out.println("LLAVES ABRE"); return new Symbol(SimbolosJAVA.LLAVES_A , yycolumn, yyline, yytext());}
    "}"                                         {System.out.println("LLAVES CIEERRE"); return new Symbol(SimbolosJAVA.LLAVES_C , yycolumn, yyline, yytext());}
    ";"                                         {System.out.println("PUNTO_COMA"); return new Symbol(SimbolosJAVA.PUNTO_COMA , yycolumn, yyline, yytext());}
    ","                                         {System.out.println("COMA"); return new Symbol(SimbolosJAVA.COMA , yycolumn, yyline, yytext());}
    "("                                         {System.out.println("PARENTESIS_A"); return new Symbol(SimbolosJAVA.PARENTESIS_A , yycolumn, yyline, yytext());}
    ")"                                         {System.out.println("PARENTESIS_C"); return new Symbol(SimbolosJAVA.PARENTESIS_C , yycolumn, yyline, yytext());}
    //"."                                         {System.out.println("punto"); return new Symbol(SimbolosJAVA.PUNTO , yycolumn, yyline, yytext());}
    //".."                                        {System.out.println("PUNTO_PUNTO"); return new Symbol(SimbolosJAVA.PUNTO_PUNTO , yycolumn, yyline, yytext());}
    
    .                               {System.out.println("error Lexico: "+"Columna: "+yycolumn+1+" linea: "+ yyline+1 + "Token: "+yytext());
                                    /*ErrorG e = new ErrorG(yyline+1, yycolumn+1,yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + (yyline+1) + " ,    Columna: " + (yycolumn+1));
                                    listaErrores.add(e);*/
                                    }
    
}
