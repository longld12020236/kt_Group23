#include <iostream>
#include <string>
#include <fstream>

using namespace std;

/*Khai bao ham tra ve so luong ky tu overlap*/
int find_overlaps(string a1, string a2);

int main()
{
    ifstream File_in;
    ofstream File_out;
    string a1,a2;
    int number_of_same_characters;
   
    File_in.open("echo.in.txt");
    File_out.open("echo.out.txt");
    File_in >> a1;
    File_in >> a2;
    if( find_overlaps(a1,a2)>find_overlaps(a2,a1) )
         number_of_same_characters = find_overlaps(a1,a2);
    else 
         number_of_same_characters = find_overlaps(a2,a1);
    File_out << number_of_same_characters;
    
    File_in.close();
    File_out.close();
   
    system("pause");
    return 0;
}

/*Dinh nghia ham tra ve so luong ky tu overlap*/
int find_overlaps(string a1, string a2)
{
    int number_of_same_characters=0,size;
    if(a1.length()<a2.length())
         size = a1.length();
    else
         size = a2.length();
    int size2=a2.length();
    a2.c_str();/* Ep kieu a2 tu kieu xau sang kieu mang ky tu*/
    for (int i=1;i<size;i++){
         char temp[50]={'\0'};
         a2.copy(temp,i,size2-i);/* Copy vao tmp doan co do dai =i, tu vi tri size2-i cua sau a2.*/
         if (a1.substr(0,i)==temp) /* ham substr tra ve chuoi con cua chuoi tu vi tri 0 va co chieu dai i ptu*/
         number_of_same_characters=i;
    }
    return number_of_same_characters;
}
