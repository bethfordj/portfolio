<template>
  <div>
    <single-row-of-list>
      <div class="list-image">
        <img class="list-image" src="@/assets/img/friend-in-trouble.png">
      </div>
      <div class="list-text">
        <h4>BEHAVIOR PROGRAM</h4>
        <p>Evaluation of each dog using specialist who determine the best training that will help your friend be a better family member</p>
        <div id="red-button">
          <b-button variant="outline" v-on:click="behaviorProgram">LEER MÁS</b-button>
        </div>
      </div>
      <img class="outside-list-image" src="@/assets/img/adoption.jpg">
    </single-row-of-list>
    <single-row-of-list>
      <div class="list-image">
        <img class="list-image" src="@/assets/img/two-dogs.jpg">
      </div>
      <div class="list-text">
        <h4>BEHAVIOR PROGRAM</h4>
        <p>Are you looking for a new family member? Then, this program is for you. Don't buy: adopt here, and let's give a home to these amazing friends!</p>
        <div id="red-button">
          <b-button variant="outline" v-on:click="adoptNow">LEER MÁS</b-button>
        </div>
      </div>
    </single-row-of-list>
  </div>
</template>
    
<script>
import SingleRowOfList from "@/components/SingleRowOfList.vue";

export default {
  name: "ProgramsInfo",
  components: {
    SingleRowOfList
  },
  methods: {
    behaviorProgram() {
      this.$router.push("/what-we-do");
    },
    adoptNow() {
      this.$router.push("/adopt-now");
    }
  }
};
</script>
<style scoped>
div {
  display: inline-block;
}
</style>

<style lang="scss">
.list-image {
  width: 150px;
  height: 150px;
}

.list-image img {
  object-fit: cover;
  object-position: center;
  overflow: hidden;
}
.list-text {
  width: 60%;
  margin-left: 2%;
}
.outside-list-image {
  width: 20%;
  float: right;
}
#red-button {
  display: block;
  @include redButton;
}

#red-button:hover {
  @include redButtonHover;
}
</style>

