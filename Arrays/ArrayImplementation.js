class MyArray{
    constructor(){
        this.length = 0;
        this.data = {};
    }

    get(index){
        return this.data[index];
    }

    push(item){
        this.data[this.length] = item;
        this.length++;
        return this.length;
    }

    pop(){
        const LastItem = this.data[this.length - 1];
        delete this.data[this.length - 1];
        this.length--;
        return LastItem;
    }

    delete(index){
        const item = this.data[index];
        this.ShiftItems(index);
        delete this.data[this.length - 1];
        this.length--;
        return item;
    }

    ShiftItems(index){
        for (let i = index; i < this.length - 1; i++) {
            this.data[i] = this.data[i+1];
        }
    }
}

//push
const newArray = new MyArray();
newArray.push('hi');
newArray.push('you');
newArray.push('there');
newArray.push('!');
newArray.push('you');
newArray.push('are');
newArray.push('nice');
newArray.push('!');
newArray.push('!');
console.log(newArray);

// pop
newArray.pop();
console.log(newArray);

// delete
newArray.delete(2);
console.log(newArray);