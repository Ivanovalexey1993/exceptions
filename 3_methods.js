function method1() {
   // Стандартный объект с ошибкой
   throw new Error('Something went wrong!');
 }
 
 function method2() {
   // пользовательский объект исключения с сообщением и кодом ошибки
   const exception = { message: "Custom exception", code: 123 };
   throw exception;
 }
 
 function method3() {
   // ошибка типа
   throw new TypeError('Invalid type!');
 }
 
 function calculateDifference(arr1, arr2) {
   if (arr1.length !== arr2.length) {
     // ошибки диапазона, если массивы имеют разную длину
     throw new RangeError('Arrays are of different lengths!');
   }
 
   const diffArr = [];
   for (let i = 0; i < arr1.length; i++) {
     diffArr.push(arr1[i] - arr2[i]);
   }
 
   return diffArr;
 }
 
 // Пример использования
 try {
   method1();
 } catch (error) {
   console.error(error);
 }
 
 try {
   method2();
 } catch (exception) {
   console.error(exception.message, exception.code);
 }
 
 try {
   method3();
 } catch (error) {
   console.error(error);
 }
 
 const arr1 = [1, 2, 3];
 const arr2 = [4, 5, 6];
 try {
   const diffArr = calculateDifference(arr1, arr2);
   console.log(diffArr);
 } catch (error) {
   console.error(error);
 } 
