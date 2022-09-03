#include<iostream>
#include<string>
#include<ctime>
using namespace std;

const double pi = 3.14;

class Person1 {
public:
	void setName(string name) {
		this->name = name;
	}
	string getName() {
		return name;
	}
private:
	string name;
	int age;
	string lover;
};
struct Person2 {
	int number;
};
int main() {
	system ("pause");
}
	


