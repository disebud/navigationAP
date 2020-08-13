package main.pertemuan3
//
//interface Hitable{
//    fun receiveDamage(attackers: Attackers)
//}
//
//interface Attackers{
//    val damage:Int
//    fun attack(hitable: Hitable)
//}
//
//class Hero(name: String, hp: Int, damage: Int):Hitable , Attackers {
//    val name: String  = name
//    var hp: Int = hp
//        private set
//    override var damage :Int = damage
//        private set
//
//    override fun attack(hitable: Hitable) {
//        hitable.receiveDamage(this)
//    }
//    override fun receiveDamage(striker: Attackers) {
//        this.hp = this.hp - striker.damage
////        println("${this.name} receive damage from ${striker.name} with hp=$hp")
//    }
//    fun getInfo(): String {
//        return "Hero(name=${this.name}, hp=$hp, damage=$damage)"
//    }
//}
//
//class Monster(var hp:Int, damage:Int):Hitable, Attackers {
//
//    override var damage= damage
//    override fun receiveDamage(hero: Attackers) {
//        this.hp = this.hp - hero.damage
////        println("Monster receive damage from ${hero.name} with hp=$hp")
//    }
//    override fun attack(hitable: Hitable){
//
//    }
//}
//class Building(var hp:Int) :Hitable{
//    override fun receiveDamage(hero: Hero) {
//        this.hp = this.hp - hero.damage
//        println("Building receive damage from ${hero.name} with hp=$hp")
//
//    }
//}
//fun main(){
//    val captainAmerica = Hero("Captain America",300,35)
//    val ironMan = Hero ("Tony Stark",300,30)
//    val tower = Building(100)
//    val kaiju = Monster(560,15)
//
//    captainAmerica.attack(ironMan)
//    captainAmerica.attack(tower)
//    captainAmerica.attack(kaiju)
//}




//
//class Hero (name: String,hp: Int, damage: Int ):Hitable{
//    val name : String = name
//    var hp:Int = hp
//    private set
//    var damage:Int = damage
//    private set
//
//    fun attack(enemy: Hitable){
//        enemy.receiveDamage(this)
//    }
//
//    override fun receiveDamage(striker: Hero){
//            this.hp = this.hp - striker.damage
//    }
//
//    fun getInfo():String {
//        return "Hero(name='${this.name}', hp=$hp, damage=$damage)"
//    }
//}
//
//class Monster(var hp:Int,var damage : Int) : Hitable {
// override  fun receiveDamage(hero : Hero){
//        this.hp = this.hp - hero.damage
//    }
//}
//
//class Building(var hp:Int ) :Hitable {
//    override fun receiveDemage(hero : Hero){
//        this.hp = this.hp - hero.damage
//    }
//}
//
//class Alien() :Hitable {
//    override fun receiveDemage(hero : Hero){
//
//    }
//}
//
//interface Hitable {
//    fun receiveDamage(hero: Hero)
//}