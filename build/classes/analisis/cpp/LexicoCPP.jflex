package analisis.cpp;
import java_cup.runtime.*;
import java.util.ArrayList;

%%
%{
    //coidgo de usuario en sintaxis java
    //public ArrayList<ErrorG> listaErrores = new  ArrayList<>();

    public void pintar(String s){
        System.out.println(yytext());
    }

%}

    //directivas
%public 
%class AnalizadorLexicoCPP
%cupsym SimbolosCPP
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
Espacio         = [ \b\n\r]+
%%



<YYINITIAL> {
    ("%%VB" ({LqSea}|.|\n)*)("%%JAVA" ({LqSea}|.|\n)*)("%%PY" ({LqSea}|.|\n)*) ("%%PROGRAMA")            {System.out.println("%%PROGRAMA"); return new Symbol(SimbolosCPP.SEPARADOR_PROGRAMA , yycolumn, yyline, yytext());}
    
    "\"VB\""                                                                    {System.out.println("Todas fVB: "+yytext()); return new Symbol(SimbolosCPP.VB_ALL , yycolumn, yyline, yytext());}
    ("\"VB." ({Letra})("_"| {Letra}| {Numero})* "()\"")                         {System.out.println("Una FuncionVB: "+yytext()); return new Symbol(SimbolosCPP.VB_ONE , yycolumn, yyline, yytext());}
    "\"PY\""                                                                    {System.out.println("Todas fPY: "+yytext()); return new Symbol(SimbolosCPP.PY_ALL , yycolumn, yyline, yytext());}
    ("\"PY." ({Letra})("_"| {Letra}| {Numero})* "()\"")                          {System.out.println("Una FuncionPY: "+yytext()); return new Symbol(SimbolosCPP.PY_ONE , yycolumn, yyline, yytext());}
    "\"JAVA.*\""                                                                {System.out.println("Todas las clases: "+yytext()); return new Symbol(SimbolosCPP.JV_ALL , yycolumn, yyline, yytext());}
    ("\"JAVA." ({Letra})("_"| {Letra}| {Numero})*"\"")                          {System.out.println("Una clase: "+yytext()); return new Symbol(SimbolosCPP.JV_ONE , yycolumn, yyline, yytext());}

    //Reservadas
    //"main"                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.VOID , yycolumn, yyline, yytext());}
    ("void main")                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.MAIN_VOID , yycolumn, yyline, yytext());}
    ("int main")                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.MAIN_INT , yycolumn, yyline, yytext());}
    "#include"                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.INCLUDE , yycolumn, yyline, yytext());}
    "const"                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.CONSTANTE , yycolumn, yyline, yytext());}
    "scanf("                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.SCANF, yycolumn, yyline, yytext());}
    "clrscr()"                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.CLEARS, yycolumn, yyline, yytext());}
    "getch()"                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.GETCH, yycolumn, yyline, yytext());}
    "&"                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.ANDPERSAND , yycolumn, yyline, yytext());}
    "&&"                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.AND , yycolumn, yyline, yytext());}
    "||"                                        {System.out.println(yytext()); return new Symbol(SimbolosCPP.OR , yycolumn, yyline, yytext());}
    "!"                                       {System.out.println(yytext()); return new Symbol(SimbolosCPP.NOT , yycolumn, yyline, yytext());}

    //Expresiones Aritmeticas
    "++"                                         {System.out.println("MAS_MAS"); return new Symbol(SimbolosCPP.MAS_MAS , yycolumn, yyline, yytext());}
    "+"                                         {System.out.println("MAS"); return new Symbol(SimbolosCPP.MAS , yycolumn, yyline, yytext());}
    "--"                                         {System.out.println("MENOS_MENOS"); return new Symbol(SimbolosCPP.MENOS_MENOS , yycolumn, yyline, yytext());}
    "-"                                         {System.out.println("MENOS"); return new Symbol(SimbolosCPP.MENOS , yycolumn, yyline, yytext());}
    "%"                                         {System.out.println("Modulo"); return new Symbol(SimbolosCPP.MODULO , yycolumn, yyline, yytext());}
    "*"                                         {System.out.println("ASTERISCO"); return new Symbol(SimbolosCPP.POR , yycolumn, yyline, yytext());}
    "/"                                         {System.out.println("DIV"); return new Symbol(SimbolosCPP.DIV , yycolumn, yyline, yytext());}
    
    //Expresiones boolenas
    "<"                                         {System.out.println("MENOR_QUE"); return new Symbol(SimbolosCPP.MENOR_QUE , yycolumn, yyline, yytext());}
    ">"                                         {System.out.println("MAYOR_QUE"); return new Symbol(SimbolosCPP.MAYOR_QUE , yycolumn, yyline, yytext());}
    "<="                                        {System.out.println("MENOR_IGUAL"); return new Symbol(SimbolosCPP.MENOR_IGUAL , yycolumn, yyline, yytext());}
    ">="                                        {System.out.println("MAYOR_IGUAL"); return new Symbol(SimbolosCPP.MAYOR_IGUAL , yycolumn, yyline, yytext());}
    "=="                                        {System.out.println("IGUAL_IGUAL"); return new Symbol(SimbolosCPP.IGUAL_IGUAL , yycolumn, yyline, yytext());}
    "!="                                        {System.out.println("DIFERENTE"); return new Symbol(SimbolosCPP.DIFERENTE , yycolumn, yyline, yytext());}
    
    //Tipo de Datos
    //"class"                                   {System.out.println(yytext()); return new Symbol(SimbolosCPP.CLASS , yycolumn, yyline, yytext());}
    "int"                                   {System.out.println(yytext()); return new Symbol(SimbolosCPP.INT , yycolumn, yyline, yytext());}
    "float"                                   {System.out.println(yytext()); return new Symbol(SimbolosCPP.FLOAT , yycolumn, yyline, yytext());}
    "char"                                     {System.out.println(yytext()); return new Symbol(SimbolosCPP.CHAR , yycolumn, yyline, yytext());}

    //Comentario
    ("//"({LqSea}|.)* "\n")                     {System.out.println("Comentario: "+yytext()); return new Symbol(SimbolosCPP.COMENTARIO_SIMPLE , yycolumn, yyline, yytext());}
    ("/*"({LqSea}|.|"\n")* "*/")                     {System.out.println("Comentario: "+yytext()); return new Symbol(SimbolosCPP.COMENTARIO_VARIOS , yycolumn, yyline, yytext());}
    

    //Mensaje Pantalla
    //"println("               {/*System.out.println("Mensaje ln: "+yytext()); return new Symbol(SimbolosCPP.PRINT_LN , yycolumn, yyline, yytext());*/}
    "printf("               {System.out.println("Mensaje: "+yytext()); return new Symbol(SimbolosCPP.PRINTF , yycolumn, yyline, yytext());}
    
    //Solicitud de Datos
    //"intinput"                                  {System.out.println("intinput"); return new Symbol(SimbolosCPP.INTINPUT , yycolumn, yyline, yytext());}
    //"floatinput"                                {System.out.println("floarinput"); return new Symbol(SimbolosCPP.FLOATINPUT , yycolumn, yyline, yytext());}
    //"charinput"                                 {System.out.println("charinput"); return new Symbol(SimbolosCPP.CHARINPUT , yycolumn, yyline, yytext());}
    
    //Ciclos
        //for
    "for"                                       {System.out.println("for"); return new Symbol(SimbolosCPP.FOR , yycolumn, yyline, yytext());}
        //while
    "while"                                     {System.out.println("while"); return new Symbol(SimbolosCPP.WHILE , yycolumn, yyline, yytext());}
    "do"                                     {System.out.println("do"); return new Symbol(SimbolosCPP.DO , yycolumn, yyline, yytext());}
    
    //Condiciones
        //IF-ELSE
    "if"                               {System.out.println(yytext()); return new Symbol(SimbolosCPP.IF , yycolumn, yyline, yytext());}
    "else"                                      {System.out.println(yytext()); return new Symbol(SimbolosCPP.ELSE , yycolumn, yyline, yytext());}
        //SWITCH
    "switch"                                    {System.out.println(yytext()); return new Symbol(SimbolosCPP.SWITCH , yycolumn, yyline, yytext());}
    "case"                                      {System.out.println(yytext()); return new Symbol(SimbolosCPP.CASE , yycolumn, yyline, yytext());}
    "break;"                                      {System.out.println(yytext()); return new Symbol(SimbolosCPP.BREAK , yycolumn, yyline, yytext());}
    "default:"                                      {System.out.println(yytext()); return new Symbol(SimbolosCPP.DEFAULT , yycolumn, yyline, yytext());}
    
    //Funciones
    //"Class"                                   {System.out.println(yytext()); return new Symbol(SimbolosCPP.CLASS , yycolumn, yyline, yytext());}
    //"void"                                  {System.out.println(yytext()); return new Symbol(SimbolosCPP.VOID, yycolumn, yyline, yytext());}
    "return"                                    {System.out.println(yytext()); return new Symbol(SimbolosCPP.RETURN , yycolumn, yyline, yytext());}
    
    //Declaracion de variables
    //"Public"                                    {System.out.println(yytext()); return new Symbol(SimbolosCPP.PUBLIC , yycolumn, yyline, yytext());}
    ({Letra})("_"| {Letra}| {Numero})*          {System.out.println("id: "+yytext()); return new Symbol(SimbolosCPP.IDENTIFICADOR , yycolumn, yyline, yytext());}
    
    ({Numero}"."{Numero})                       {System.out.println("DECIMAL: "+yytext()); return new Symbol(SimbolosCPP.DECIMAL , yycolumn, yyline, new Float(yytext()));}
    ({Numero})                                  {System.out.println("NUMERO: "+yytext()); return new Symbol(SimbolosCPP.NUMERO , yycolumn, yyline,new Integer(yytext()));}
    ("'"({LqSea}|.)*"'")                        {System.out.println(yytext()); return new Symbol(SimbolosCPP.VALOR , yycolumn, yyline, yytext());}
    ("\""({LqSea}|.)*"\"")                      {System.out.println(yytext()); return new Symbol(SimbolosCPP.TEXTO , yycolumn, yyline, yytext());}
    
    
    //{Siguiente}                                   {/*Ignore*/}
    {Espacio}                                   {/*Ignore*/}
    //"\n"                                        {System.out.println("SALTO"); return new Symbol(SimbolosCPP.SALTO , yycolumn, yyline, yytext());}
    //"\t"                                        {System.out.println("TAB"); return new Symbol(SimbolosCPP.TAB , yycolumn, yyline, yytext());}
    //"\""                                        {System.out.println("comillas"); return new Symbol(SimbolosCPP.COMILLAS , yycolumn, yyline, yytext());}
    
    "="                                        {System.out.println("IGUAL"); return new Symbol(SimbolosCPP.IGUAL , yycolumn, yyline, yytext());}
    //"'"                                         {System.out.println("NUMERO: "+yytext()); return new Symbol(SimbolosCPP_GL , yycolumn, yyline, yytext());}
    ":"                                         {System.out.println("dos puntos"); return new Symbol(SimbolosCPP.DOS_PUNTOS , yycolumn, yyline, yytext());}
    "["                                         {System.out.println("CHORCHETE ABRE"); return new Symbol(SimbolosCPP.CORCHETE_A , yycolumn, yyline, yytext());}
    "]"                                         {System.out.println("CORCHE CIERRE"); return new Symbol(SimbolosCPP.CORCHETE_C , yycolumn, yyline, yytext());}
    "{"                                         {System.out.println("LLAVES ABRE"); return new Symbol(SimbolosCPP.LLAVES_A , yycolumn, yyline, yytext());}
    "}"                                         {System.out.println("LLAVES CIEERRE"); return new Symbol(SimbolosCPP.LLAVES_C , yycolumn, yyline, yytext());}
    ";"                                         {System.out.println("PUNTO_COMA"); return new Symbol(SimbolosCPP.PUNTO_COMA , yycolumn, yyline, yytext());}
    ","                                         {System.out.println("COMA"); return new Symbol(SimbolosCPP.COMA , yycolumn, yyline, yytext());}
    "("                                         {System.out.println("PARENTESIS_A"); return new Symbol(SimbolosCPP.PARENTESIS_A , yycolumn, yyline, yytext());}
    ")"                                         {System.out.println("PARENTESIS_C"); return new Symbol(SimbolosCPP.PARENTESIS_C , yycolumn, yyline, yytext());}
    "."                                         {System.out.println("punto"); return new Symbol(SimbolosCPP.PUNTO , yycolumn, yyline, yytext());}
    //".."                                        {System.out.println("PUNTO_PUNTO"); return new Symbol(SimbolosCPP.PUNTO_PUNTO , yycolumn, yyline, yytext());}

    .                               {System.out.println("error Lexico: "+"Columna: "+(yycolumn+1)+" linea: "+ (yyline+1) + ", Token: "+yytext());
                                    /*ErrorG e = new ErrorG((yyline+1), (yycolumn+1),yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + ((int)yyline+1) + " ,    Columna: " + ((int)yycolumn+1));
                                    listaErrores.add(e);*/
                                    }
    
}
