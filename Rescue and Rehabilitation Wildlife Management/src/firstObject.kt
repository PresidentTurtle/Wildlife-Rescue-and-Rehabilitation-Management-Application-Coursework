class firstObject {
        private var name: String? = null

        private var age = 0

        fun Object(name: String, age: Int) {
            this.name = name
            this.age = age
        }

        override fun toString(): String {
            return "Name: " + name + ", Age: " + age
        }
    }
