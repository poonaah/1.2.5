// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.saj;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

// Referenced classes of package argo.saj:
//            InvalidSyntaxException, PositionTrackingPushbackReader, JsonListener

public final class SajParser
{

    public SajParser()
    {
    }

    public void func_27463_a(Reader p_27463_1_, JsonListener p_27463_2_)
        throws InvalidSyntaxException, IOException
    {
        PositionTrackingPushbackReader positiontrackingpushbackreader = new PositionTrackingPushbackReader(p_27463_1_);
        char c = (char)positiontrackingpushbackreader.func_27333_c();
        switch(c)
        {
        case 123: // '{'
            positiontrackingpushbackreader.func_27334_a(c);
            p_27463_2_.func_27195_b();
            func_27453_b(positiontrackingpushbackreader, p_27463_2_);
            break;

        case 91: // '['
            positiontrackingpushbackreader.func_27334_a(c);
            p_27463_2_.func_27195_b();
            func_27455_a(positiontrackingpushbackreader, p_27463_2_);
            break;

        default:
            throw new InvalidSyntaxException((new StringBuilder()).append("Expected either [ or { but got [").append(c).append("].").toString(), positiontrackingpushbackreader);
        }
        int i = func_27448_l(positiontrackingpushbackreader);
        if(i != -1)
        {
            throw new InvalidSyntaxException((new StringBuilder()).append("Got unexpected trailing character [").append((char)i).append("].").toString(), positiontrackingpushbackreader);
        } else
        {
            p_27463_2_.func_27204_c();
            return;
        }
    }

    private void func_27455_a(PositionTrackingPushbackReader p_27455_1_, JsonListener p_27455_2_)
        throws InvalidSyntaxException, IOException
    {
        char c = (char)func_27448_l(p_27455_1_);
        if(c != '[')
        {
            throw new InvalidSyntaxException((new StringBuilder()).append("Expected object to start with [ but got [").append(c).append("].").toString(), p_27455_1_);
        }
        p_27455_2_.func_27200_d();
        char c1 = (char)func_27448_l(p_27455_1_);
        p_27455_1_.func_27334_a(c1);
        if(c1 != ']')
        {
            func_27464_d(p_27455_1_, p_27455_2_);
        }
        boolean flag = false;
        do
        {
            if(flag)
            {
                break;
            }
            char c2 = (char)func_27448_l(p_27455_1_);
            switch(c2)
            {
            case 44: // ','
                func_27464_d(p_27455_1_, p_27455_2_);
                break;

            case 93: // ']'
                flag = true;
                break;

            default:
                throw new InvalidSyntaxException((new StringBuilder()).append("Expected either , or ] but got [").append(c2).append("].").toString(), p_27455_1_);
            }
        } while(true);
        p_27455_2_.func_27197_e();
    }

    private void func_27453_b(PositionTrackingPushbackReader p_27453_1_, JsonListener p_27453_2_)
        throws InvalidSyntaxException, IOException
    {
        char c = (char)func_27448_l(p_27453_1_);
        if(c != '{')
        {
            throw new InvalidSyntaxException((new StringBuilder()).append("Expected object to start with { but got [").append(c).append("].").toString(), p_27453_1_);
        }
        p_27453_2_.func_27194_f();
        char c1 = (char)func_27448_l(p_27453_1_);
        p_27453_1_.func_27334_a(c1);
        if(c1 != '}')
        {
            func_27449_c(p_27453_1_, p_27453_2_);
        }
        boolean flag = false;
        do
        {
            if(flag)
            {
                break;
            }
            char c2 = (char)func_27448_l(p_27453_1_);
            switch(c2)
            {
            case 44: // ','
                func_27449_c(p_27453_1_, p_27453_2_);
                break;

            case 125: // '}'
                flag = true;
                break;

            default:
                throw new InvalidSyntaxException((new StringBuilder()).append("Expected either , or } but got [").append(c2).append("].").toString(), p_27453_1_);
            }
        } while(true);
        p_27453_2_.func_27203_g();
    }

    private void func_27449_c(PositionTrackingPushbackReader p_27449_1_, JsonListener p_27449_2_)
        throws InvalidSyntaxException, IOException
    {
        char c = (char)func_27448_l(p_27449_1_);
        if('"' != c)
        {
            throw new InvalidSyntaxException((new StringBuilder()).append("Expected object identifier to begin with [\"] but got [").append(c).append("].").toString(), p_27449_1_);
        }
        p_27449_1_.func_27334_a(c);
        p_27449_2_.func_27205_a(func_27452_i(p_27449_1_));
        char c1 = (char)func_27448_l(p_27449_1_);
        if(c1 != ':')
        {
            throw new InvalidSyntaxException((new StringBuilder()).append("Expected object identifier to be followed by : but got [").append(c1).append("].").toString(), p_27449_1_);
        } else
        {
            func_27464_d(p_27449_1_, p_27449_2_);
            p_27449_2_.func_27199_h();
            return;
        }
    }

    private void func_27464_d(PositionTrackingPushbackReader p_27464_1_, JsonListener p_27464_2_)
        throws InvalidSyntaxException, IOException
    {
        char c = (char)func_27448_l(p_27464_1_);
        switch(c)
        {
        case 34: // '"'
            p_27464_1_.func_27334_a(c);
            p_27464_2_.func_27198_c(func_27452_i(p_27464_1_));
            break;

        case 116: // 't'
            char ac[] = new char[3];
            int i = p_27464_1_.func_27336_b(ac);
            if(i != 3 || ac[0] != 'r' || ac[1] != 'u' || ac[2] != 'e')
            {
                p_27464_1_.func_27335_a(ac);
                throw new InvalidSyntaxException((new StringBuilder()).append("Expected 't' to be followed by [[r, u, e]], but got [").append(Arrays.toString(ac)).append("].").toString(), p_27464_1_);
            }
            p_27464_2_.func_27196_i();
            break;

        case 102: // 'f'
            char ac1[] = new char[4];
            int j = p_27464_1_.func_27336_b(ac1);
            if(j != 4 || ac1[0] != 'a' || ac1[1] != 'l' || ac1[2] != 's' || ac1[3] != 'e')
            {
                p_27464_1_.func_27335_a(ac1);
                throw new InvalidSyntaxException((new StringBuilder()).append("Expected 'f' to be followed by [[a, l, s, e]], but got [").append(Arrays.toString(ac1)).append("].").toString(), p_27464_1_);
            }
            p_27464_2_.func_27193_j();
            break;

        case 110: // 'n'
            char ac2[] = new char[3];
            int k = p_27464_1_.func_27336_b(ac2);
            if(k != 3 || ac2[0] != 'u' || ac2[1] != 'l' || ac2[2] != 'l')
            {
                p_27464_1_.func_27335_a(ac2);
                throw new InvalidSyntaxException((new StringBuilder()).append("Expected 'n' to be followed by [[u, l, l]], but got [").append(Arrays.toString(ac2)).append("].").toString(), p_27464_1_);
            }
            p_27464_2_.func_27202_k();
            break;

        case 45: // '-'
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
            p_27464_1_.func_27334_a(c);
            p_27464_2_.func_27201_b(func_27459_a(p_27464_1_));
            break;

        case 123: // '{'
            p_27464_1_.func_27334_a(c);
            func_27453_b(p_27464_1_, p_27464_2_);
            break;

        case 91: // '['
            p_27464_1_.func_27334_a(c);
            func_27455_a(p_27464_1_, p_27464_2_);
            break;

        default:
            throw new InvalidSyntaxException((new StringBuilder()).append("Invalid character at start of value [").append(c).append("].").toString(), p_27464_1_);
        }
    }

    private String func_27459_a(PositionTrackingPushbackReader p_27459_1_)
        throws IOException, InvalidSyntaxException
    {
        StringBuilder stringbuilder = new StringBuilder();
        char c = (char)p_27459_1_.func_27333_c();
        if('-' == c)
        {
            stringbuilder.append('-');
        } else
        {
            p_27459_1_.func_27334_a(c);
        }
        stringbuilder.append(func_27451_b(p_27459_1_));
        return stringbuilder.toString();
    }

    private String func_27451_b(PositionTrackingPushbackReader p_27451_1_)
        throws IOException, InvalidSyntaxException
    {
        StringBuilder stringbuilder = new StringBuilder();
        char c = (char)p_27451_1_.func_27333_c();
        if('0' == c)
        {
            stringbuilder.append('0');
            stringbuilder.append(func_27462_f(p_27451_1_));
            stringbuilder.append(func_27454_g(p_27451_1_));
        } else
        {
            p_27451_1_.func_27334_a(c);
            stringbuilder.append(func_27460_c(p_27451_1_));
            stringbuilder.append(func_27456_e(p_27451_1_));
            stringbuilder.append(func_27462_f(p_27451_1_));
            stringbuilder.append(func_27454_g(p_27451_1_));
        }
        return stringbuilder.toString();
    }

    private char func_27460_c(PositionTrackingPushbackReader p_27460_1_)
        throws IOException, InvalidSyntaxException
    {
        char c1 = (char)p_27460_1_.func_27333_c();
        char c;
        switch(c1)
        {
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
            c = c1;
            break;

        default:
            throw new InvalidSyntaxException((new StringBuilder()).append("Expected a digit 1 - 9 but got [").append(c1).append("].").toString(), p_27460_1_);
        }
        return c;
    }

    private char func_27458_d(PositionTrackingPushbackReader p_27458_1_)
        throws IOException, InvalidSyntaxException
    {
        char c1 = (char)p_27458_1_.func_27333_c();
        char c;
        switch(c1)
        {
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
            c = c1;
            break;

        default:
            throw new InvalidSyntaxException((new StringBuilder()).append("Expected a digit 1 - 9 but got [").append(c1).append("].").toString(), p_27458_1_);
        }
        return c;
    }

    private String func_27456_e(PositionTrackingPushbackReader p_27456_1_)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = false;
        do
        {
            while(!flag) 
            {
                char c = (char)p_27456_1_.func_27333_c();
                switch(c)
                {
                case 48: // '0'
                case 49: // '1'
                case 50: // '2'
                case 51: // '3'
                case 52: // '4'
                case 53: // '5'
                case 54: // '6'
                case 55: // '7'
                case 56: // '8'
                case 57: // '9'
                    stringbuilder.append(c);
                    break;

                default:
                    flag = true;
                    p_27456_1_.func_27334_a(c);
                    break;
                }
            }
            return stringbuilder.toString();
        } while(true);
    }

    private String func_27462_f(PositionTrackingPushbackReader p_27462_1_)
        throws IOException, InvalidSyntaxException
    {
        StringBuilder stringbuilder = new StringBuilder();
        char c = (char)p_27462_1_.func_27333_c();
        if(c == '.')
        {
            stringbuilder.append('.');
            stringbuilder.append(func_27458_d(p_27462_1_));
            stringbuilder.append(func_27456_e(p_27462_1_));
        } else
        {
            p_27462_1_.func_27334_a(c);
        }
        return stringbuilder.toString();
    }

    private String func_27454_g(PositionTrackingPushbackReader p_27454_1_)
        throws IOException, InvalidSyntaxException
    {
        StringBuilder stringbuilder = new StringBuilder();
        char c = (char)p_27454_1_.func_27333_c();
        if(c == '.' || c == 'E')
        {
            stringbuilder.append('E');
            stringbuilder.append(func_27461_h(p_27454_1_));
            stringbuilder.append(func_27458_d(p_27454_1_));
            stringbuilder.append(func_27456_e(p_27454_1_));
        } else
        {
            p_27454_1_.func_27334_a(c);
        }
        return stringbuilder.toString();
    }

    private String func_27461_h(PositionTrackingPushbackReader p_27461_1_)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        char c = (char)p_27461_1_.func_27333_c();
        if(c == '+' || c == '-')
        {
            stringbuilder.append(c);
        } else
        {
            p_27461_1_.func_27334_a(c);
        }
        return stringbuilder.toString();
    }

    private String func_27452_i(PositionTrackingPushbackReader p_27452_1_)
        throws InvalidSyntaxException, IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        char c = (char)p_27452_1_.func_27333_c();
        if('"' != c)
        {
            throw new InvalidSyntaxException((new StringBuilder()).append("Expected [\"] but got [").append(c).append("].").toString(), p_27452_1_);
        }
        boolean flag = false;
        do
        {
            if(flag)
            {
                break;
            }
            char c1 = (char)p_27452_1_.func_27333_c();
            switch(c1)
            {
            case 34: // '"'
                flag = true;
                break;

            case 92: // '\\'
                char c2 = func_27457_j(p_27452_1_);
                stringbuilder.append(c2);
                break;

            default:
                stringbuilder.append(c1);
                break;
            }
        } while(true);
        return stringbuilder.toString();
    }

    private char func_27457_j(PositionTrackingPushbackReader p_27457_1_)
        throws IOException, InvalidSyntaxException
    {
        char c1 = (char)p_27457_1_.func_27333_c();
        char c;
        switch(c1)
        {
        case 34: // '"'
            c = '"';
            break;

        case 92: // '\\'
            c = '\\';
            break;

        case 47: // '/'
            c = '/';
            break;

        case 98: // 'b'
            c = '\b';
            break;

        case 102: // 'f'
            c = '\f';
            break;

        case 110: // 'n'
            c = '\n';
            break;

        case 114: // 'r'
            c = '\r';
            break;

        case 116: // 't'
            c = '\t';
            break;

        case 117: // 'u'
            c = (char)func_27450_k(p_27457_1_);
            break;

        default:
            throw new InvalidSyntaxException((new StringBuilder()).append("Unrecognised escape character [").append(c1).append("].").toString(), p_27457_1_);
        }
        return c;
    }

    private int func_27450_k(PositionTrackingPushbackReader p_27450_1_)
        throws IOException, InvalidSyntaxException
    {
        char ac[] = new char[4];
        int i = p_27450_1_.func_27336_b(ac);
        if(i != 4)
        {
            throw new InvalidSyntaxException((new StringBuilder()).append("Expected a 4 digit hexidecimal number but got only [").append(i).append("], namely [").append(String.valueOf(ac, 0, i)).append("].").toString(), p_27450_1_);
        }
        int j;
        try
        {
            j = Integer.parseInt(String.valueOf(ac), 16);
        }
        catch(NumberFormatException numberformatexception)
        {
            p_27450_1_.func_27335_a(ac);
            throw new InvalidSyntaxException((new StringBuilder()).append("Unable to parse [").append(String.valueOf(ac)).append("] as a hexidecimal number.").toString(), numberformatexception, p_27450_1_);
        }
        return j;
    }

    private int func_27448_l(PositionTrackingPushbackReader p_27448_1_)
        throws IOException
    {
        boolean flag = false;
        int i;
        do
        {
            i = p_27448_1_.func_27333_c();
            switch(i)
            {
            default:
                flag = true;
                break;

            case 9: // '\t'
            case 10: // '\n'
            case 13: // '\r'
            case 32: // ' '
                break;
            }
        } while(!flag);
        return i;
    }
}
