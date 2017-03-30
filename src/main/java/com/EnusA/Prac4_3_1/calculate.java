package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
//Implements OCP
/*public abstract class calculate {
      public int answer(int num1, int num2)
      {
          int ans = num1 + num2;
          return ans;
      }


}*/
//violates OCP
public class calculate {
    public int answer(int num1, int num2) {
        int ans = num1 * num2;
        return ans;
    }
}
