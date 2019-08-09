<template>
  <div class="selectable-links">
    <single-row-of-list>
      <div>
        <h3
          class="not-selected"
          id="programs"
          v-on:click="programIsSelected=true"
          :class="{selected : programIsSelected}"
        >PROGRAMS</h3>
        <h3
          class="not-selected"
          id="companies"
          v-on:click="programIsSelected=false"
          :class="{selected : !programIsSelected}"
        >ASSOCIATED COMPANIES</h3>
      </div>
    </single-row-of-list>
    <single-row-of-list v-if="programIsSelected">
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
    <single-row-of-list v-if="programIsSelected">
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
  data() {
    return {
      programIsSelected: true
    };
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
<style scoped lang="scss">
div {
  display: inline-block;
}
h4 {
  color: $color-red;
}
</style>

<style lang="scss">
.list-image img {
  object-fit: cover;
  object-position: center;
  overflow: hidden;
}
.not-selected {
  color: $color-gray;
}
.selected {
  color: $color-blue;
}
#companies:hover {
  text-decoration: underline;
}
#programs:hover {
  text-decoration: underline;
}
#red-button {
  display: block;
  @include redButton;
}

#red-button:hover {
  @include redButtonHover;
}

@media only screen and (min-device-width: 320px) {
  h3 {
    font-size: 14px;
    margin-left: 15px;
  }
  .list-image {
    width: 150px;
    height: 150px;
  }
  .list-text {
    width: 60%;
    margin-left: 2%;
  }
  .list-image,
  .list-text {
    display: block;
    margin-left: 15px;
    width: 75%;
  }
  .outside-list-image {
    width: 0%;
  }
}
@media only screen and (min-width: 768px) {
  h3 {
    font-size: 18px;
    margin-left: 5%;

    margin-left: 25px;
  }
  .list-image {
    width: 140px;
    height: 140px;
  }
  .list-text {
    width: 45%;
    margin-left: 5%;
  }
  .selectable-links {
    width: 100%;
    display: flex;
    justify-content: space-around;
  }
  .outside-list-image {
    width: 0%;
  }
}
@media only screen and (min-width: 1224px) {
  .list-image {
    width: 150px;
    height: 150px;
  }
  .list-text {
    width: 60%;
    margin-left: 2%;
  }
  .outside-list-image {
    width: 20%;
    float: right;
  }
}
</style>

