#Втора лабораториска вежба во Софтверско инженерство

## Кристијан Богоев, бр. на индекс 226043

### Control Flow Graph
![Control Flow Graph](https://github.com/KristijanBogoev/-SI_2024_lab2_226043/assets/162916594/ec6bd8a2-c00a-41c6-9a4b-9b05e569be77)

### Цикломатска комплексност
Цикломатската комплексност на кодот кој што е претставен со графот горе е пресметана со формулата P+1, која истата даде резултат 10 така што P го претставува бројот на предикатни јазли во кодот чиј број е 9.

###Тест случаи според критериумот Every Branch
За да биде исполнет Every Branch тестот потребно е да се поминат јазлите за одлука и сите можни исходи на истите.
![Every Branch Test](https://github.com/KristijanBogoev/-SI_2024_lab2_226043/assets/162916594/29720a87-6acc-43b0-9137-cedab29cbaaa)
Тука имам направено тестови за испонување на Every Branch критериумот.
Првиот тест фрла "allItems list can't be null!" exception, поради тоа што имам внесено како аргумент на методот празна листа.
Вториот тест фрла "Invalid character in item barcode!" exception, поради тоа што имам внесено bracode=3n1, а тоа не е дозволено.
Четвртиот тест фрла "No barcode!" exception, поради тоа што имаме внесено null како вредноста на barcode-от.

###Test slu;ai spored kriteriumot Multiple Condition
![Multiple Condition test](https://github.com/KristijanBogoev/-SI_2024_lab2_226043/assets/162916594/d7fa5a18-f007-4f63-a4b5-5d2facaaec3a)
За исполнување на критериумот за Multiple Condition во зависност од условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0)
== '0') потребно е да се поминат сите можни опции за кога условот е точен и неточен.

