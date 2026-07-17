const numbers =[1,2,3,4,5];

const result = numbers.filter(num => num >= 3).map(num => num*2)
console.log(result);


const index = numbers.findIndex(num => num >= 3)
console.log(index);

const isTrue = numbers.includes(3)
console.log(isTrue);


const numbers2 = [1,[2,3],4,5]
console.log(numbers2.flat());

