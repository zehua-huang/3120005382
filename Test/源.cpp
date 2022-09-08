#include<iostream>
#include<string>
#include<ctime>
#include<fstream>
using namespace std;

void test() {
	ofstream of;
	of.open("test.txt", ios::out);
	of << "asvf" << endl;
	of << "sada" << endl;
	of.close();
}
void test2() {
	ifstream if1;
	if1.open("test.txt", ios::in);
	if (if1.is_open() == 0) {
		cout << "打开失败";
	}
	char buf[1000] = {0};
	while (if1 >> buf) {

	}
}
int main() {
	test();
	system("pause");
	return 0;
}


