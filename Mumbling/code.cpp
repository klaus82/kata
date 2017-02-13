#include <string>

class Accumul
{
public:
    static std::string accum(const std::string &s){

      std::string str = s;
      std::string ret = "";
      
      int i;
      for(i = 0; i < str.length(); i++)
      {
          ret = toupper(str[i]);          
          for(int k=1; k<=i;k++)
          {
              ret = ret + str[i]; 
          }
      }
      
      return ret;
    }
};