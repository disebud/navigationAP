package main.entity

class Robot(x:Int, y: Int) {
    var x : Int = x
    private set
    var y : Int = y
    private set

    fun PerintahProses(perintah: String){
        for(i in perintah){

            if (i == 'F'){
                Forward()
            }else if (i == 'B'){
                Bottom()
            }else if (i == 'R'){
                Right()
            }else if (i == 'L'){
                Left()
            }
            println("> $i -> ($x,$y)")
        }
    }

    private fun Forward(){
        this.y += 1
    }
    private fun Bottom(){
        this.y -= 1
    }
    private fun Left(){
        this.x -= 1
    }
    private fun Right(){
        this.x += 1
    }

}