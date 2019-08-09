<template>
  <div class="home">
    <div class="home-grid">
      <div class="image-and-overlay">
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
.card-text {
  padding: 5%;
  width: 90%;
  margin: 0px;
}
.home-grid {
  display: grid;
  grid-template-columns: 1fr;
  grid-template-areas: "featureImage";
}
.home-footer {
  grid-area: homeFooter;
  width: 110%;
  position: absolute;
  bottom: 0px;
}
.image-and-overlay {
  grid-area: featureImage;
}
.image-text-card {
  box-shadow: -2px 10px 18px -4px rgba(0, 0, 0, 0.75);
  height: fit-content;
}
.list {
  margin-bottom: 35%;
}
.relative-div {
  position: absolute;
}

.video-card img {
  width: 100%;
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
  object-fit: cover;
  position: absolute;
  width: 110%;
}
#transparent-overlay {
  object-fit: cover;
  position: absolute;
  background-color: $color-transparent-div;
  width: 100%;
  height: fit-content;
  color: $color-red;
  padding: 5%;
  overflow: hidden;
  z-index: 500;
}
@media only screen and (min-device-width: 320px) {
  .card-navbar {
    padding: 1px 0px 1px 15px;
    font-family: $font-family-primary;
    font-size: 14px;
  }
  h1 {
    font-size: 20px;
  }
  .image-text-card,
  .video-card {
    width: 80%;
    margin: 5% 7% 5% 7%;
  }
  .relative-div {
    top: 82%;
    margin: auto;
  }
  .video-card img {
    object-position: 0rem -2rem;
  }
  #red-button {
    font-size: 12px;
  }
  #top-image {
    top: 46%;
  }
  #transparent-overlay {
    top: 66.5%;
    height: 60px;
  }
}
@media only screen and (min-width: 400px) {
  .relative-div {
    top: 90%;
  }
  #top-image {
    top: 42%;
  }
  #transparent-overlay {
    top: 70%;
  }
}
@media only screen and (min-width: 500px) {
  .relative-div {
    top: 98%;
  }
  #top-image {
    top: 42%;
  }
  #transparent-overlay {
    top: 80%;
  }
}
@media only screen and (min-width: 650px) {
  p {
    display: inline-block;
  }
  .card-navbar {
    padding: 0.5rem 0rem 0.5rem 1rem;
    font-family: $font-family-primary;
  }

  .relative-div {
    top: 82%;
  }

  .image-text-card {
    width: 35%;
  }
  .video-card {
    width: 60%;
  }
  .video-card img {
    object-position: 0rem -6rem;
  }
  #top-image {
    top: 24%;
  }
  #transparent-overlay {
    top: 60%;
  }
}

@media only screen and (min-width: 750px) {
  p {
    display: inline-block;
  }
  .card-navbar {
    padding: 0.5rem 0rem 0.5rem 1rem;
    font-family: $font-family-primary;
  }

  .relative-div {
    top: 100%;
  }

  .image-text-card {
    width: 35%;
  }
  .video-card {
    width: 60%;
  }
  .video-card img {
    object-position: 0rem -6rem;
  }
  #top-image {
    top: 14%;
  }
  #transparent-overlay {
    top: 80%;
  }
}
@media only screen and (min-width: 750px) {
  p {
    display: inline-block;
  }
  .card-navbar {
    padding: 0.5rem 0rem 0.5rem 1rem;
    font-family: $font-family-primary;
  }

  .relative-div {
    top: 130%;
  }

  .image-text-card {
    width: 60%;
  }
  .video-card {
    width: 100%;
  }
  .video-card img {
    object-position: 0rem -2rem;
  }
  #top-image {
    top: 12%;
  }
  #transparent-overlay {
    top: 108%;
  }
}
</style>