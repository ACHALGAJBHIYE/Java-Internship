/*
 
Integer p, q, r
set p = 7, q = 4, r = 5
if((p+r)<(q-p) || (r<p))
    r = q&p 
    r = (r+3)&p
    end if
print p+q+r    

*/

public class Sudo1
{
    public static void main(String[] args)
    {
        int p, q, r;
        p = 7;
        q = 4;
        r = 5;

        if((p+r)<(q-p) || (r<p))
        {
            r = q&p;
            r = (r+3)&p;
        }
        System.out.println(p+q+r);
    }
}

// 18