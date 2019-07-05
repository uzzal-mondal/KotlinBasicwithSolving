package MayKotlinSolving.Basic

class Student {

    var id: Int = 0
    var name: String="Uzzal"
    var dept: String = "Suzal"


    constructor() {

    }

    constructor(id: Int, name: String, dept: String) {
        this.id = id
        this.name = name
        this.dept = dept
    }
}


