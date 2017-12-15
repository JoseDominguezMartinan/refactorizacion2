/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author jdominguezmartinan
 */
public class CalculoFactorial
{

   

        int num;
        int factor;

        /**
         * Método para calcular el numero factorial.
         *
         
         */
        public void calcFactorial()
        {
            num = 8;

            int i;
            if(num==0)
            {
                factor = 1;
            } else
            {
                factor = 1;
                for(i = num; i>=1; i--)
                {
                    factor = factor*i;
                }
            }
        }
        /**
         * get 
         * @return num
         */

        public int getNum()
        {
            return num;
        }
        /**
         * set 
         * @param num 
         */

        public void setNum(int num)
        {
            this.num = num;
        }
        /**
         * get
         * @return factor 
         */

        public int getFactor()
        {
            return factor;
        }
        /**
         * set
         * @param factor 
         */

        public void setFactor(int factor)
        {
            this.factor = factor;
        }
        
    }


