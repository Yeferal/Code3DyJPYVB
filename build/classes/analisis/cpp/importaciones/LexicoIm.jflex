package analisis.cpp.importaciones;
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
%class AnalizadorLexicoIm
%cupsym SimbolosIm
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
vb              = "VB"
jv              = "JAVA"
py              = "PY"
Numero          = {Digito} {Digito}*
LqSea           =  ({Signo}|{Letra}|{Numero})*
Espacio         = [\t\r\n]+
%%




<YYINITIAL> {
    {vb}                                        {System.out.print(yytext()); return new Symbol(SimbolosIm.VB , yycolumn, yyline, yytext());}
    {jv}                                        {System.out.print(yytext()); return new Symbol(SimbolosIm.JV , yycolumn, yyline, yytext());}
    {py}                                        {System.out.print(yytext()); return new Symbol(SimbolosIm.PY , yycolumn, yyline, yytext());}
    "."                                         {System.out.print(yytext()); return new Symbol(SimbolosIm.PUNTO , yycolumn, yyline, yytext());}
    "*"                                         {System.out.print(yytext()); return new Symbol(SimbolosIm.ASTERISCO , yycolumn, yyline, yytext());}
    "\""                                        {System.out.print(yytext()); return new Symbol(SimbolosIm.COMILLAS , yycolumn, yyline, yytext());}
    ({Letra})("_"| {Letra}| {Numero})*          {System.out.print("id: "+yytext()); return new Symbol(SimbolosIm.IDENTIFICADOR , yycolumn, yyline, yytext());}
    ({Numero}"."{Numero})                       {System.out.print("DECIMAL: "+yytext()); return new Symbol(SimbolosIm.DECIMAL , yycolumn, yyline, yytext());}
    ({Numero})                                  {System.out.print("NUMERO: "+yytext()); return new Symbol(SimbolosIm.NUMERO , yycolumn, yyline, yytext());}
    //{Espacio}                                 {/*Ignore*/}

    .                               {System.out.println("error Lexico: "+"Columna: "+(yycolumn+1)+" linea: "+ (yyline+1) + " Token: "+yytext());
                                    /*ErrorG e = new ErrorG(yyline+1, yycolumn+1,yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + (yyline+1) + " ,    Columna: " + (yycolumn+1));
                                    listaErrores.add(e);*/
                                    }

}
