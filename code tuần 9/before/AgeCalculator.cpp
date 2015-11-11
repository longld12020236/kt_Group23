#include <iostream>
using namespace std;


int main()
{
    int year_now, age_now, another_year, another_age, month_now, month_born, another_month, month_age;
    cout << "enter the current year then press Return: \n";
    cin  >> year_now;
    cout << "enter the current month (a number from 1 to 12) : \n";
    cin  >> month_now;
    cout << "enter the current age in year: \n";
    cin  >> age_now;
    cout << "Enter the month in which you were born (a number from 1 to 12) : \n";
    cin  >> month_born;
    cout << "Enter the year for which you wish to know your age:\n";
    cin  >> another_year;
    cout << "enter the month in this year: \n";
    cin  >> another_month;
    
    another_age = another_year - (year_now - age_now);
    month_age = another_month - month_born;
    if (month_age < 0) {
        another_age = another_age -1;
        month_age = month_age + 12;              
    }
    if (another_age >= 0) {
        if (another_age > 150) {
             cout << "Sorry, but you'll probably be dead by "<< another_age << " year\n";                
        }
        else {
             cout << "Your age in " << another_month << "/"<< another_year << ": ";
             if (month_age <= 1){ 
		     cout << another_age << " years and " << month_age << " month\n";
             }
             else {
             cout << another_age << " years and " << month_age << " months\n";
             }
        }
	} 
    else { 
		cout << "You weren't even born in ";
		cout << another_year << "!\n"; 
	}

    system("pause");
    return 0;    
}
