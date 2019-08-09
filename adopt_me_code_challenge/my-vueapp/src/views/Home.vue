<template>
  <div class="home">
    <div>
      <full-width-image>
        <img id="top-image" src="@/assets/img/dogs.jpg">
      </full-width-image>
      <div id="transparent-overlay">
        <h1>This is your new family!</h1>
        <div id="red-button">
          <b-button variant="outline" v-on:click="adoptNow">ADOPT NOW</b-button>
        </div>
      </div>
    </div>
    <div class="relative-div">
      <two-card-display>
        <div class="image-text-card">
          <blue-nav-bar class="card-navbar">
            <h3>VOLUNTEERS</h3>
          </blue-nav-bar>
          <full-width-image>
            <img id="card-image" src="@/assets/img/girl.png">
          </full-width-image>
          <div>
            <p
              class="card-text"
            >Amazing people, doing the difference every single day. Join us now and be part of a community that is changing the world.</p>
            <div id="blue-card-button">
              <b-button variant="outline" v-on:click="goToJoinUs">JOIN US</b-button>
            </div>
          </div>
        </div>
        <div class="video-card">
          <red-nav-bar class="card-navbar">
            <h3>TESTIMONIAL OF THE MONTH</h3>
          </red-nav-bar>
          <full-width-image class="testimonial-image">
            <img src="@/assets/img/testimonial.jpg">
          </full-width-image>
        </div>
      </two-card-display>
      <div class="list">
        <programs-info/>
      </div>
      <blue-nav-bar class="home-footer">
        <footer-information/>
      </blue-nav-bar>
    </div>
  </div>
</template>

<script>
import FullWidthImage from "@/components/FullWidthImage.vue";
import TwoCardDisplay from "@/components/TwoCardDisplay.vue";
import BlueNavBar from "@/components/BlueNavBar.vue";
import RedNavBar from "@/components/RedNavBar.vue";
import FooterInformation from "@/components/FooterInformation.vue";
import ProgramsInfo from "@/components/ProgramsInfo.vue";
export default {
  name: "home",
  components: {
    FullWidthImage,
    TwoCardDisplay,
    BlueNavBar,
    RedNavBar,
    FooterInformation,
    ProgramsInfo
  },
  methods: {
    goToJoinUs() {
      this.$router.push("/join-us");
    },
    adoptNow() {
      this.$router.push("/adopt-now");
    }
  }
};
</script>

<style lang="scss">
.card-navbar {
  padding: 0.5rem 0rem 0.5rem 1rem;
  font-family: $font-family-primary;
}
.card-text {
  padding: 5%;
  width: 90%;
  margin: 0px;
}
.image-text-card {
  width: 35%;
  box-shadow: -2px 10px 18px -4px rgba(0, 0, 0, 0.75);
  height: fit-content;
}
.list {
  margin-bottom: 5%;
}
.relative-div {
  position: absolute;
  top: 80%;
}

.video-card {
  width: 60%;
}
.video-card img {
  width: 100%;
  object-position: 0rem -6rem;
  overflow: hidden;
}
#blue-card-button {
  padding: 5px;
  border-radius: 0px;
  background: white;
  border: 2px solid $color-blue;
  color: $color-blue;
  font-size: 1rem;
  margin: 0rem 0rem 1.5rem 1.5rem;
  width: fit-content;
  height: fit-content;
  font-weight: 700px;
  font-family: $font-family-secondary;
}
#blue-card-button:hover {
  background: $color-blue;
  color: white;
}
#card-image {
  width: 100%;
}

#red-button {
  @include redButton;
}

#red-button:hover {
  @include redButtonHover;
}
#top-image {
  position: absolute;
  max-width: 105%;
  object-fit: cover;
  object-position: 0rem -10rem;
  z-index: -1;
}
#transparent-overlay {
  position: absolute;
  background-color: $color-transparent-div;
  width: 100%;
  height: fit-content;
  color: $color-red;
  padding: 5%;
  overflow: hidden;
  top: 45%;
}
</style>