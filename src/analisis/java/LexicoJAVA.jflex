package analisis.java;
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
    ("%%VB" ({LqSea}|.|"\n")*)("%%JAVA")                                    {pintar("%%JAVA"); return new Symbol(SimbolosJAVA.SEPARADOR_JAVA , yycolumn, yyline, yytext());}
    //("%%VB" ({LqSea}|.|"")*)("%%JAVA")                                      {pintar(yytext()); return new Symbol(SimbolosJAVA.SEPARADOR_JAVA , yycolumn, yyline, yytext());}
    ("%%PY" ({LqSea}|.|"\n")*)("%%PROGRAMA" ({LqSea}|.|"\n")*)                    {/*pintar(yytext());*/ return new Symbol(SimbolosJAVA.SEPARADOR_PROGRAMA , yycolumn, yyline, yytext());}
    
    //Tipo de Datos
    "class"                                   {pintar(yytext()); return new Symbol(SimbolosJAVA.CLASS , yycolumn, yyline, yytext());}
    "int"                                   {pintar(yytext()); return new Symbol(SimbolosJAVA.INT , yycolumn, yyline, yytext());}
    "float"                                   {pintar(yytext()); return new Symbol(SimbolosJAVA.FLOAT , yycolumn, yyline, yytext());}
    "char"                                     {pintar(yytext()); return new Symbol(SimbolosJAVA.CHAR , yycolumn, yyline, yytext());}
    
    //Reservadas
    "&&"                                       {pintar(yytext()); return new Symbol(SimbolosJAVA.AND , yycolumn, yyline, yytext());}
    "||"                                        {pintar(yytext()); return new Symbol(SimbolosJAVA.OR , yycolumn, yyline, yytext());}
    "!"                                       {pintar(yytext()); return new Symbol(SimbolosJAVA.NOT , yycolumn, yyline, yytext());}
    //"%"                                       {pintar(yytext()); return new Symbol(SimbolosJAVA.NOT , yycolumn, yyline, yytext());}

    //Expresiones Aritmeticas
    "++"                                         {pintar("MAS_MAS"); return new Symbol(SimbolosJAVA.MAS_MAS , yycolumn, yyline, yytext());}
    "+"                                         {pintar("MAS"); return new Symbol(SimbolosJAVA.MAS , yycolumn, yyline, yytext());}
    "--"                                         {pintar("MENOS_MENOS"); return new Symbol(SimbolosJAVA.MENOS_MENOS , yycolumn, yyline, yytext());}
    "-"                                         {pintar("MENOS"); return new Symbol(SimbolosJAVA.MENOS , yycolumn, yyline, yytext());}
    "*"                                         {pintar("ASTERISCO"); return new Symbol(SimbolosJAVA.POR , yycolumn, yyline, yytext());}
    "/"                                         {pintar("DIV"); return new Symbol(SimbolosJAVA.DIV , yycolumn, yyline, yytext());}
    
    //Expresiones boolenas
    "<"                                         {pintar("MENOR_QUE"); return new Symbol(SimbolosJAVA.MENOR_QUE , yycolumn, yyline, yytext());}
    ">"                                         {pintar("MAYOR_QUE"); return new Symbol(SimbolosJAVA.MAYOR_QUE , yycolumn, yyline, yytext());}
    "<="                                        {pintar("MENOR_IGUAL"); return new Symbol(SimbolosJAVA.MENOR_IGUAL , yycolumn, yyline, yytext());}
    ">="                                        {pintar("MAYOR_IGUAL"); return new Symbol(SimbolosJAVA.MAYOR_IGUAL , yycolumn, yyline, yytext());}
    "=="                                        {pintar("IGUAL_IGUAL"); return new Symbol(SimbolosJAVA.IGUAL_IGUAL , yycolumn, yyline, yytext());}
    "!="                                        {pintar("DIFERENTE"); return new Symbol(SimbolosJAVA.DIFERENTE , yycolumn, yyline, yytext());}
    
    //Comentario
    ("//"({LqSea}|.)* "\n")                     {pintar("Comentario: "+yytext()); return new Symbol(SimbolosJAVA.COMENTARIO_SIMPLE , yycolumn, yyline, yytext());}
    ("/*"({LqSea}|.|"\n")* "*/")                     {pintar("Comentario: "+yytext()); return new Symbol(SimbolosJAVA.COMENTARIO_VARIOS , yycolumn, yyline, yytext());}
    
    //Mensaje Pantalla
    "System.out.println("               {pintar("Mensaje SOUT: "+yytext()); return new Symbol(SimbolosJAVA.SOUT , yycolumn, yyline, yytext());}
    
    //Solicitud de Datos
    "intinput"                                  {pintar("intinput"); return new Symbol(SimbolosJAVA.INTINPUT , yycolumn, yyline, yytext());}
    "floatinput"                                {pintar("floarinput"); return new Symbol(SimbolosJAVA.FLOATINPUT , yycolumn, yyline, yytext());}
    "charinput"                                 {pintar("charinput"); return new Symbol(SimbolosJAVA.CHARINPUT , yycolumn, yyline, yytext());}
    
    //Ciclos
        //for
    "for"                                       {pintar("for"); return new Symbol(SimbolosJAVA.FOR , yycolumn, yyline, yytext());}
        //while
    "while"                                     {pintar("while"); return new Symbol(SimbolosJAVA.WHILE , yycolumn, yyline, yytext());}
    "do"                                     {pintar("do"); return new Symbol(SimbolosJAVA.DO , yycolumn, yyline, yytext());}
    
    //Condiciones
        //IF-ELSE
    "if"                               {pintar(yytext()); return new Symbol(SimbolosJAVA.IF , yycolumn, yyline, yytext());}
    "else"                                      {pintar(yytext()); return new Symbol(SimbolosJAVA.ELSE , yycolumn, yyline, yytext());}
        //SWITCH
    "switch"                                    {pintar(yytext()); return new Symbol(SimbolosJAVA.SWITCH , yycolumn, yyline, yytext());}
    "case"                                      {pintar(yytext()); return new Symbol(SimbolosJAVA.CASE , yycolumn, yyline, yytext());}
    "break"                                      {pintar(yytext()); return new Symbol(SimbolosJAVA.BREAK , yycolumn, yyline, yytext());}
    "default"                                      {pintar(yytext()); return new Symbol(SimbolosJAVA.DEFAULT , yycolumn, yyline, yytext());}
    
    //Funciones
    "void"                                  {pintar(yytext()); return new Symbol(SimbolosJAVA.VOID, yycolumn, yyline, yytext());}
    "return"                                    {pintar(yytext()); return new Symbol(SimbolosJAVA.RETURN , yycolumn, yyline, yytext());}
    
    //Declaracion de variables
    "public"                                    {pintar(yytext()); return new Symbol(SimbolosJAVA.PUBLIC , yycolumn, yyline, yytext());}
    ({Letra})("_"| {Letra}| {Numero})*          {pintar("id: "+yytext()); return new Symbol(SimbolosJAVA.IDENTIFICADOR , yycolumn, yyline, yytext());}
    
    ({Numero}"."{Numero})                       {pintar("DECIMAL: "+yytext()); return new Symbol(SimbolosJAVA.DECIMAL , yycolumn, yyline, new Float(yytext()));}
    ({Numero})                                  {pintar("NUMERO: "+yytext()); return new Symbol(SimbolosJAVA.NUMERO , yycolumn, yyline, new Integer(yytext()));}
    ("'"({LqSea}|.)"'")                        {pintar(yytext()); return new Symbol(SimbolosJAVA.VALOR , yycolumn, yyline, yytext());}
    ("\""({LqSea}|.)*"\"")                      {pintar("texto"+yytext()); return new Symbol(SimbolosJAVA.TEXTO , yycolumn, yyline, yytext());}
    
    {Espacio}                                   {/*Ignore*/}
    //"\n"                                       {pintar("salto"); return new Symbol(SimbolosJAVA.SALTO , yycolumn, yyline, yytext());}
    //"\""                                        {pintar("comillas"); return new Symbol(SimbolosJAVA.COMILLAS , yycolumn, yyline, yytext());}
    
    "="                                        {pintar("IGUAL"); return new Symbol(SimbolosJAVA.IGUAL , yycolumn, yyline, yytext());}
    //"'"                                         {pintar("NUMERO: "+yytext()); return new Symbol(SimbolosJAVA.GL , yycolumn, yyline, yytext());}
    ":"                                         {pintar("dos puntos"); return new Symbol(SimbolosJAVA.DOS_PUNTOS , yycolumn, yyline, yytext());}
    "["                                         {pintar("CHORCHETE ABRE"); return new Symbol(SimbolosJAVA.CORCHETE_A , yycolumn, yyline, yytext());}
    "]"                                         {pintar("CORCHE CIERRE"); return new Symbol(SimbolosJAVA.CORCHETE_C , yycolumn, yyline, yytext());}
    "{"                                         {pintar("LLAVES ABRE"); return new Symbol(SimbolosJAVA.LLAVES_A , yycolumn, yyline, yytext());}
    "}"                                         {pintar("LLAVES CIEERRE"); return new Symbol(SimbolosJAVA.LLAVES_C , yycolumn, yyline, yytext());}
    ";"                                         {pintar("PUNTO_COMA"); return new Symbol(SimbolosJAVA.PUNTO_COMA , yycolumn, yyline, yytext());}
    ","                                         {pintar("COMA"); return new Symbol(SimbolosJAVA.COMA , yycolumn, yyline, yytext());}
    "("                                         {pintar("PARENTESIS_A"); return new Symbol(SimbolosJAVA.PARENTESIS_A , yycolumn, yyline, yytext());}
    ")"                                         {pintar("PARENTESIS_C"); return new Symbol(SimbolosJAVA.PARENTESIS_C , yycolumn, yyline, yytext());}
    //"."                                         {pintar("punto"); return new Symbol(SimbolosJAVA.PUNTO , yycolumn, yyline, yytext());}
    //".."                                        {pintar("PUNTO_PUNTO"); return new Symbol(SimbolosJAVA.PUNTO_PUNTO , yycolumn, yyline, yytext());}
    
    .                               {pintar("error Lexico: "+"Columna: "+yycolumn+1+" linea: "+ yyline+1 + "Token: "+yytext());
                                    /*ErrorG e = new ErrorG(yyline+1, yycolumn+1,yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + (yyline+1) + " ,    Columna: " + (yycolumn+1));
                                    listaErrores.add(e);*/
                                    }
    
}
