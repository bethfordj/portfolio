<template>
  <div id="app">
    <p class="grade" v-if="score === 'A'">Wow! Outstanding</p>
    <p class="grade" v-else-if="score === 'B'">Your family is so proud...</p>
    <p class="grade" v-else-if="score === 'C'">Okay</p>
    <p class="grade" v-else>Hmmmmm.....</p>

    <!-- <img v-bind:src="puppyImageSrc" class="something" v-bind:class="puppyPicture" />

    <p>{{ imageLength }}</p>-->

    <!-- <div v-for="n in 5" v-bind:key="n">The number is {{ n }}</div> -->

    <!-- <div v-for="n in 'test'" v-bind:key="n">The character is {{ n }}</div> -->

    <!-- <div v-for="n in { test: 123, foo: 'bar'}" v-bind:key="n">The value is {{ n }}</div>

    <div v-for="(v, k) in { test: 123, foo: 'bar'}" v-bind:key="k">The value for {{ k }} is {{ v }}</div>-->

    <div
      v-for="(name, i) in ['Andrew', 'Beth', 'Michael', 'Gunther']"
      v-bind:key="name"
    >{{ i }} - {{ name }}</div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      score: "",
      showCutePuppy: true,
      cutePuppyImage:
        "https://images.pexels.com/photos/39317/chihuahua-dog-puppy-cute-39317.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
      puppyPicture: "puppy-picture"
    };
  },
  computed: {
    puppyImageSrc() {
      if (this.showCutePuppy) {
        return this.cutePuppyImage;
      }
      return "https://i.pinimg.com/originals/0f/65/76/0f6576717758f097dcd6c7b1530a5e75.jpg";
    },
    imageLength() {
      return (this.puppyImageSrc.length + 50) / 3;
    }
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.grade {
  font-size: 1.3em;
}

.puppy-picture {
  border: 1px solid blue;
  border-radius: 10px;
}

.something {
  margin: 10px;
}
</style>
