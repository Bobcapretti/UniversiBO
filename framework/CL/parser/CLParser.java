/* Generated By:JavaCC: Do not edit this line. CLParser.java */
package parser;

import syntaxtree.*;
import java.util.Vector;


public class CLParser implements CLParserConstants {
   public static void main(String args[]) throws ParseException
   {
      CLParser parser;
      if ( args.length == 0 )
      {
         System.out.println("JavaCC Parser:  Reading from standard input . . .");
         parser = new CLParser(System.in);
      }
      else
         if ( args.length == 1 )
         {
            System.out.println("JavaCC Parser:  Reading from file " + args[0]+ " . . .");
            try
            {
               parser = new CLParser(new java.io.FileInputStream(args[0]));
            }
            catch (java.io.FileNotFoundException e)
            {
               System.out.println("JavaCC Parser:  File " + args[0]+ " not found.");
               return;
            }
         }
         else
         {
            System.out.println("JavaCC Parser:  Usage is one of:");
            System.out.println("         java JavaCCParser < inputfile");
            System.out.println("OR");
            System.out.println("         java JavaCCParser inputfile");
            return;
         }
      try
      {
         start root = parser.start();
         root.accept(new visitor.SchemeTreeBuilder());
         System.out.println("JavaCC Parser:  Java program parsed successfully.");
      }
      catch (ParseException e)
      {
         System.out.println(e.getMessage());
         System.out.println("JavaCC Parser:  Encountered errors during parse.");
      }
   }

  final public start start() throws ParseException {
    trace_call("start");
    try {
   NodeListOptional n0 = new NodeListOptional();
   istruzione n1;
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case EVENT:
        case STARTS:
        case DEF_OP:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        n1 = istruzione();
        n0.addNode(n1);
      }
     n0.nodes.trimToSize();
     {if (true) return new start(n0);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("start");
    }
  }

  final public istruzione istruzione() throws ParseException {
    trace_call("istruzione");
    try {
   NodeChoice n0;
   eventDefinition n1;
   startDefinition n2;
   opDefinition n3;
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EVENT:
        n1 = eventDefinition();
        n0 = new NodeChoice(n1, 0);
        break;
      case STARTS:
        n2 = startDefinition();
        n0 = new NodeChoice(n2, 1);
        break;
      case DEF_OP:
        n3 = opDefinition();
        n0 = new NodeChoice(n3, 2);
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
     {if (true) return new istruzione(n0);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("istruzione");
    }
  }

  final public eventDefinition eventDefinition() throws ParseException {
    trace_call("eventDefinition");
    try {
   NodeToken n0;
   Token n1;
   NodeToken n2;
   Token n3;
   NodeToken n4;
   Token n5;
   condition n6;
   NodeToken n7;
   Token n8;
      n1 = jj_consume_token(EVENT);
                n0 = JTBToolkit.makeNodeToken(n1);
      n3 = jj_consume_token(VARIABILE);
                    n2 = JTBToolkit.makeNodeToken(n3);
      n5 = jj_consume_token(DEF);
              n4 = JTBToolkit.makeNodeToken(n5);
      n6 = condition();
      n8 = jj_consume_token(END);
              n7 = JTBToolkit.makeNodeToken(n8);
     {if (true) return new eventDefinition(n0,n2,n4,n6,n7);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("eventDefinition");
    }
  }

  final public startDefinition startDefinition() throws ParseException {
    trace_call("startDefinition");
    try {
   NodeToken n0;
   Token n1;
   NodeToken n2;
   Token n3;
   condition n4;
   NodeOptional n5 = new NodeOptional();
   NodeSequence n6;
   NodeToken n7;
   Token n8;
   NodeToken n9;
   Token n10;
   condition n11;
   NodeToken n12;
   Token n13;
      n1 = jj_consume_token(STARTS);
                 n0 = JTBToolkit.makeNodeToken(n1);
      n3 = jj_consume_token(WHEN);
               n2 = JTBToolkit.makeNodeToken(n3);
      n4 = condition();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ENDS:
        n6 = new NodeSequence(3);
        n8 = jj_consume_token(ENDS);
                  n7 = JTBToolkit.makeNodeToken(n8);
        n6.addNode(n7);
        n10 = jj_consume_token(WHEN);
                   n9 = JTBToolkit.makeNodeToken(n10);
        n6.addNode(n9);
        n11 = condition();
        n6.addNode(n11);
        n5.addNode(n6);
        break;
      default:
        jj_la1[2] = jj_gen;
        ;
      }
      n13 = jj_consume_token(END);
               n12 = JTBToolkit.makeNodeToken(n13);
     {if (true) return new startDefinition(n0,n2,n4,n5,n12);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("startDefinition");
    }
  }

  final public opDefinition opDefinition() throws ParseException {
    trace_call("opDefinition");
    try {
   NodeToken n0;
   Token n1;
   NodeToken n2;
   Token n3;
   NodeToken n4;
   Token n5;
   NodeToken n6;
   Token n7;
   NodeToken n8;
   Token n9;
   NodeToken n10;
   Token n11;
   NodeToken n12;
   Token n13;
   NodeToken n14;
   Token n15;
   NodeToken n16;
   Token n17;
   listaParam n18;
   NodeToken n19;
   Token n20;
   NodeToken n21;
   Token n22;
   listaParam n23;
   NodeToken n24;
   Token n25;
   NodeToken n26;
   Token n27;
   NodeToken n28;
   Token n29;
   NodeToken n30;
   Token n31;
   NodeToken n32;
   Token n33;
   NodeToken n34;
   Token n35;
   NodeToken n36;
   Token n37;
      n1 = jj_consume_token(DEF_OP);
                 n0 = JTBToolkit.makeNodeToken(n1);
      n3 = jj_consume_token(O_BRACE);
                  n2 = JTBToolkit.makeNodeToken(n3);
      n5 = jj_consume_token(OP);
             n4 = JTBToolkit.makeNodeToken(n5);
      n7 = jj_consume_token(LIST_SEP);
                   n6 = JTBToolkit.makeNodeToken(n7);
      n9 = jj_consume_token(NUM);
              n8 = JTBToolkit.makeNodeToken(n9);
      n11 = jj_consume_token(LIST_SEP);
                    n10 = JTBToolkit.makeNodeToken(n11);
      n13 = jj_consume_token(NUM);
               n12 = JTBToolkit.makeNodeToken(n13);
      n15 = jj_consume_token(C_BRACE);
                   n14 = JTBToolkit.makeNodeToken(n15);
      n17 = jj_consume_token(IN);
              n16 = JTBToolkit.makeNodeToken(n17);
      n18 = listaParam();
      n20 = jj_consume_token(STOP);
                n19 = JTBToolkit.makeNodeToken(n20);
      n22 = jj_consume_token(OUT);
               n21 = JTBToolkit.makeNodeToken(n22);
      n23 = listaParam();
      n25 = jj_consume_token(STOP);
                n24 = JTBToolkit.makeNodeToken(n25);
      n27 = jj_consume_token(DEF);
               n26 = JTBToolkit.makeNodeToken(n27);
      n29 = jj_consume_token(NS);
              n28 = JTBToolkit.makeNodeToken(n29);
      n31 = jj_consume_token(VARIABILE);
                     n30 = JTBToolkit.makeNodeToken(n31);
      n33 = jj_consume_token(NSLEFT);
                  n32 = JTBToolkit.makeNodeToken(n33);
      n35 = jj_consume_token(NSRIGHT);
                   n34 = JTBToolkit.makeNodeToken(n35);
      n37 = jj_consume_token(END);
               n36 = JTBToolkit.makeNodeToken(n37);
     {if (true) return new opDefinition(n0,n2,n4,n6,n8,n10,n12,n14,n16,n18,n19,n21,n23,n24,n26,n28,n30,n32,n34,n36);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("opDefinition");
    }
  }

  final public listaParam listaParam() throws ParseException {
    trace_call("listaParam");
    try {
   NodeToken n0;
   Token n1;
   NodeOptional n2 = new NodeOptional();
   NodeSequence n3;
   NodeToken n4;
   Token n5;
   listaParam n6;
   NodeToken n7;
   Token n8;
   NodeOptional n9 = new NodeOptional();
   NodeToken n10;
   Token n11;
   NodeListOptional n12 = new NodeListOptional();
   NodeSequence n13;
   NodeToken n14;
   Token n15;
   NodeToken n16;
   Token n17;
   NodeOptional n18;
   NodeSequence n19;
   NodeToken n20;
   Token n21;
   listaParam n22;
   NodeToken n23;
   Token n24;
   NodeOptional n25;
   NodeToken n26;
   Token n27;
      n1 = jj_consume_token(NOME);
               n0 = JTBToolkit.makeNodeToken(n1);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPEN:
        n3 = new NodeSequence(3);
        n5 = jj_consume_token(OPEN);
                  n4 = JTBToolkit.makeNodeToken(n5);
        n3.addNode(n4);
        n6 = listaParam();
        n3.addNode(n6);
        n8 = jj_consume_token(CLOSE);
                   n7 = JTBToolkit.makeNodeToken(n8);
        n3.addNode(n7);
        n2.addNode(n3);
        break;
      default:
        jj_la1[3] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STAR:
        n11 = jj_consume_token(STAR);
                   n10 = JTBToolkit.makeNodeToken(n11);
        n9.addNode(n10);
        break;
      default:
        jj_la1[4] = jj_gen;
        ;
      }
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_2;
        }
        n18 = new NodeOptional();
        n25 = new NodeOptional();
        n13 = new NodeSequence(4);
        n15 = jj_consume_token(COMMA);
                    n14 = JTBToolkit.makeNodeToken(n15);
        n13.addNode(n14);
        n17 = jj_consume_token(NOME);
                   n16 = JTBToolkit.makeNodeToken(n17);
        n13.addNode(n16);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OPEN:
           n19 = new NodeSequence(3);
          n21 = jj_consume_token(OPEN);
                      n20 = JTBToolkit.makeNodeToken(n21);
           n19.addNode(n20);
          n22 = listaParam();
           n19.addNode(n22);
          n24 = jj_consume_token(CLOSE);
                       n23 = JTBToolkit.makeNodeToken(n24);
           n19.addNode(n23);
           n18.addNode(n19);
          break;
        default:
          jj_la1[6] = jj_gen;
          ;
        }
        n13.addNode(n18);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case STAR:
          n27 = jj_consume_token(STAR);
                      n26 = JTBToolkit.makeNodeToken(n27);
           n25.addNode(n26);
          break;
        default:
          jj_la1[7] = jj_gen;
          ;
        }
        n13.addNode(n25);
        n12.addNode(n13);
      }
     n12.nodes.trimToSize();
     {if (true) return new listaParam(n0,n2,n9,n12);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("listaParam");
    }
  }

  final public condition condition() throws ParseException {
    trace_call("condition");
    try {
   NodeChoice n0;
   NodeSequence n1;
   term n2;
   NodeListOptional n3 = new NodeListOptional();
   NodeSequence n4;
   NodeToken n5;
   Token n6;
   term n7;
   NodeSequence n8;
   NodeToken n9;
   Token n10;
   NodeToken n11;
   Token n12;
   condition n13;
   NodeListOptional n14 = new NodeListOptional();
   NodeSequence n15;
   NodeToken n16;
   Token n17;
   condition n18;
   NodeOptional n19 = new NodeOptional();
   outputFilter n20;
   NodeToken n21;
   Token n22;
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LBRACE:
      case NUM:
      case TIME:
      case DOLLARO:
      case NS:
      case AT:
      case O_BRACE:
      case STRINGA:
        n1 = new NodeSequence(2);
        n2 = term();
        n1.addNode(n2);
        label_3:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case OP:
            ;
            break;
          default:
            jj_la1[8] = jj_gen;
            break label_3;
          }
           n4 = new NodeSequence(2);
          n6 = jj_consume_token(OP);
                   n5 = JTBToolkit.makeNodeToken(n6);
           n4.addNode(n5);
          n7 = term();
           n4.addNode(n7);
           n3.addNode(n4);
        }
        n3.nodes.trimToSize();
        n1.addNode(n3);
        n0 = new NodeChoice(n1, 0);
        break;
      case OP:
        n8 = new NodeSequence(6);
        n10 = jj_consume_token(OP);
                 n9 = JTBToolkit.makeNodeToken(n10);
        n8.addNode(n9);
        n12 = jj_consume_token(O_BRACE);
                n11 = JTBToolkit.makeNodeToken(n12);
        n8.addNode(n11);
        n13 = condition();
        n8.addNode(n13);
        label_4:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case LIST_SEP:
            ;
            break;
          default:
            jj_la1[9] = jj_gen;
            break label_4;
          }
           n15 = new NodeSequence(2);
          n17 = jj_consume_token(LIST_SEP);
                          n16 = JTBToolkit.makeNodeToken(n17);
           n15.addNode(n16);
          n18 = condition();
           n15.addNode(n18);
           n14.addNode(n15);
        }
        n14.nodes.trimToSize();
        n8.addNode(n14);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OUT:
          n20 = outputFilter();
           n19.addNode(n20);
          break;
        default:
          jj_la1[10] = jj_gen;
          ;
        }
        n8.addNode(n19);
        n22 = jj_consume_token(C_BRACE);
                n21 = JTBToolkit.makeNodeToken(n22);
        n8.addNode(n21);
        n0 = new NodeChoice(n8, 1);
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
     {if (true) return new condition(n0);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("condition");
    }
  }

  final public outputFilter outputFilter() throws ParseException {
    trace_call("outputFilter");
    try {
   NodeToken n0;
   Token n1;
   NodeOptional n2 = new NodeOptional();
   NodeSequence n3;
   NodeToken n4;
   Token n5;
   NodeToken n6;
   Token n7;
   listaParam n8;
   NodeToken n9;
   Token n10;
      n1 = jj_consume_token(OUT);
              n0 = JTBToolkit.makeNodeToken(n1);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPEN:
        n3 = new NodeSequence(2);
        n5 = jj_consume_token(OPEN);
                  n4 = JTBToolkit.makeNodeToken(n5);
        n3.addNode(n4);
        n7 = jj_consume_token(CLOSE);
                   n6 = JTBToolkit.makeNodeToken(n7);
        n3.addNode(n6);
        n2.addNode(n3);
        break;
      default:
        jj_la1[12] = jj_gen;
        ;
      }
      n8 = listaParam();
      n10 = jj_consume_token(STOP);
                n9 = JTBToolkit.makeNodeToken(n10);
     {if (true) return new outputFilter(n0,n2,n8,n9);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("outputFilter");
    }
  }

  final public lista lista() throws ParseException {
    trace_call("lista");
    try {
   NodeToken n0;
   Token n1;
   condition n2;
   NodeListOptional n3 = new NodeListOptional();
   NodeSequence n4;
   NodeToken n5;
   Token n6;
   condition n7;
   NodeToken n8;
   Token n9;
      n1 = jj_consume_token(LBRACE);
            n0 = JTBToolkit.makeNodeToken(n1);
      n2 = condition();
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LIST_SEP:
          ;
          break;
        default:
          jj_la1[13] = jj_gen;
          break label_5;
        }
        n4 = new NodeSequence(2);
        n6 = jj_consume_token(LIST_SEP);
                      n5 = JTBToolkit.makeNodeToken(n6);
        n4.addNode(n5);
        n7 = condition();
        n4.addNode(n7);
        n3.addNode(n4);
      }
     n3.nodes.trimToSize();
      n9 = jj_consume_token(RBRACE);
            n8 = JTBToolkit.makeNodeToken(n9);
     {if (true) return new lista(n0,n2,n3,n8);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("lista");
    }
  }

  final public term term() throws ParseException {
    trace_call("term");
    try {
   NodeChoice n0;
   NodeSequence n1;
   NodeToken n2;
   Token n3;
   NodeToken n4;
   Token n5;
   namespace n6;
   elem n7;
   NodeSequence n8;
   NodeToken n9;
   Token n10;
   condition n11;
   NodeToken n12;
   Token n13;
   NodeSequence n14;
   NodeToken n15;
   Token n16;
   NodeToken n17;
   Token n18;
   NodeListOptional n19 = new NodeListOptional();
   NodeSequence n20;
   NodeToken n21;
   Token n22;
   NodeToken n23;
   Token n24;
   NodeToken n25;
   Token n26;
   NodeOptional n27;
   NodeSequence n28;
   condition n29;
   NodeListOptional n30;
   NodeSequence n31;
   NodeToken n32;
   Token n33;
   condition n34;
   NodeToken n35;
   Token n36;
   lista n37;
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DOLLARO:
        n1 = new NodeSequence(2);
        n3 = jj_consume_token(DOLLARO);
                     n2 = JTBToolkit.makeNodeToken(n3);
        n1.addNode(n2);
        n5 = jj_consume_token(VARIABILE);
                       n4 = JTBToolkit.makeNodeToken(n5);
        n1.addNode(n4);
        n0 = new NodeChoice(n1, 0);
        break;
      case NS:
        n6 = namespace();
        n0 = new NodeChoice(n6, 1);
        break;
      case NUM:
      case TIME:
      case STRINGA:
        n7 = elem();
        n0 = new NodeChoice(n7, 2);
        break;
      case O_BRACE:
        n8 = new NodeSequence(3);
        n10 = jj_consume_token(O_BRACE);
                n9 = JTBToolkit.makeNodeToken(n10);
        n8.addNode(n9);
        n11 = condition();
        n8.addNode(n11);
        n13 = jj_consume_token(C_BRACE);
                n12 = JTBToolkit.makeNodeToken(n13);
        n8.addNode(n12);
        n0 = new NodeChoice(n8, 3);
        break;
      case AT:
        n14 = new NodeSequence(3);
        n16 = jj_consume_token(AT);
                 n15 = JTBToolkit.makeNodeToken(n16);
        n14.addNode(n15);
        n18 = jj_consume_token(VARIABILE);
                        n17 = JTBToolkit.makeNodeToken(n18);
        n14.addNode(n17);
        label_6:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case CALL:
            ;
            break;
          default:
            jj_la1[14] = jj_gen;
            break label_6;
          }
           n27 = new NodeOptional();
           n20 = new NodeSequence(5);
          n22 = jj_consume_token(CALL);
                      n21 = JTBToolkit.makeNodeToken(n22);
           n20.addNode(n21);
          n24 = jj_consume_token(VARIABILE);
                           n23 = JTBToolkit.makeNodeToken(n24);
           n20.addNode(n23);
          n26 = jj_consume_token(O_BRACE);
                   n25 = JTBToolkit.makeNodeToken(n26);
           n20.addNode(n25);
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case LBRACE:
          case NUM:
          case TIME:
          case DOLLARO:
          case NS:
          case AT:
          case O_BRACE:
          case STRINGA:
          case OP:
              n30 = new NodeListOptional();
              n28 = new NodeSequence(2);
            n29 = condition();
              n28.addNode(n29);
            label_7:
            while (true) {
              switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
              case LIST_SEP:
                ;
                break;
              default:
                jj_la1[15] = jj_gen;
                break label_7;
              }
                 n31 = new NodeSequence(2);
              n33 = jj_consume_token(LIST_SEP);
                         n32 = JTBToolkit.makeNodeToken(n33);
                 n31.addNode(n32);
              n34 = condition();
                 n31.addNode(n34);
                 n30.addNode(n31);
            }
              n30.nodes.trimToSize();
              n28.addNode(n30);
              n27.addNode(n28);
            break;
          default:
            jj_la1[16] = jj_gen;
            ;
          }
           n20.addNode(n27);
          n36 = jj_consume_token(C_BRACE);
                   n35 = JTBToolkit.makeNodeToken(n36);
           n20.addNode(n35);
           n19.addNode(n20);
        }
        n19.nodes.trimToSize();
        n14.addNode(n19);
        n0 = new NodeChoice(n14, 4);
        break;
      case LBRACE:
        n37 = lista();
        n0 = new NodeChoice(n37, 5);
        break;
      default:
        jj_la1[17] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
     {if (true) return new term(n0);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("term");
    }
  }

  final public elem elem() throws ParseException {
    trace_call("elem");
    try {
   NodeChoice n0;
   NodeToken n1;
   Token n2;
   NodeToken n3;
   Token n4;
   NodeToken n5;
   Token n6;
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
        n2 = jj_consume_token(NUM);
                 n1 = JTBToolkit.makeNodeToken(n2);
        n0 = new NodeChoice(n1, 0);
        break;
      case TIME:
        n4 = jj_consume_token(TIME);
                  n3 = JTBToolkit.makeNodeToken(n4);
        n0 = new NodeChoice(n3, 1);
        break;
      case STRINGA:
        n6 = jj_consume_token(STRINGA);
                     n5 = JTBToolkit.makeNodeToken(n6);
        n0 = new NodeChoice(n5, 2);
        break;
      default:
        jj_la1[18] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
     {if (true) return new elem(n0);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("elem");
    }
  }

  final public namespace namespace() throws ParseException {
    trace_call("namespace");
    try {
   NodeToken n0;
   Token n1;
   NodeToken n2;
   Token n3;
   NodeToken n4;
   Token n5;
   NodeToken n6;
   Token n7;
      n1 = jj_consume_token(NS);
             n0 = JTBToolkit.makeNodeToken(n1);
      n3 = jj_consume_token(VARIABILE);
                    n2 = JTBToolkit.makeNodeToken(n3);
      n5 = jj_consume_token(NSLEFT);
                 n4 = JTBToolkit.makeNodeToken(n5);
      n7 = jj_consume_token(NSRIGHT);
                  n6 = JTBToolkit.makeNodeToken(n7);
     {if (true) return new namespace(n0,n2,n4,n6);}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("namespace");
    }
  }

  public CLParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_0();
      jj_la1_1();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0x80a000,0x80a000,0x20000,0x80000000,0x10000000,0x40000000,0x80000000,0x10000000,0x0,0x400000,0x200,0x11c1840,0x80000000,0x400000,0x0,0x400000,0x11c1840,0x11c1840,0x1800,};
   }
   private static void jj_la1_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x8000,0x0,0x0,0x8020,0x0,0x0,0x4000,0x0,0x8020,0x20,0x20,};
   }

  public CLParser(java.io.InputStream stream) {
     this(stream, null);
  }
  public CLParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CLParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public CLParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CLParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public CLParser(CLParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public void ReInit(CLParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      trace_token(token, "");
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
      trace_token(token, " (in getNextToken)");
    return token;
  }

  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.Vector jj_expentries = new java.util.Vector();
  private int[] jj_expentry;
  private int jj_kind = -1;

  public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[48];
    for (int i = 0; i < 48; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 48; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  private int trace_indent = 0;
  private boolean trace_enabled = true;

  final public void enable_tracing() {
    trace_enabled = true;
  }

  final public void disable_tracing() {
    trace_enabled = false;
  }

  final private void trace_call(String s) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Call:   " + s);
    }
    trace_indent = trace_indent + 2;
  }

  final private void trace_return(String s) {
    trace_indent = trace_indent - 2;
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Return: " + s);
    }
  }

  final private void trace_token(Token t, String where) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Consumed token: <" + tokenImage[t.kind]);
      if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
        System.out.print(": \"" + t.image + "\"");
      }
      System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
    }
  }

  final private void trace_scan(Token t1, int t2) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Visited token: <" + tokenImage[t1.kind]);
      if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
        System.out.print(": \"" + t1.image + "\"");
      }
      System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
    }
  }

}

class JTBToolkit {
   static NodeToken makeNodeToken(Token t) {
      return new NodeToken(t.image.intern(), t.kind, t.beginLine, t.beginColumn, t.endLine, t.endColumn);
   }
}
