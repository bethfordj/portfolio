<template>
  <red-nav-bar class="top-navbar">
    <ul>
      <li class="lef-column">
        <router-link id="logo-url" v-bind:to="{ name: 'home' }" tag="li" exact>
          <p id="adopt-me">
            <img class="nav-logo" src="@/assets/img/logo.png">Adoptme.Org
          </p>
        </router-link>
      </li>
      <li class="three-top-nav-links">
        <router-link v-bind:to="{ name: 'whatWeDo' }" tag="li">WHAT we do</router-link>
      </li>
      <li class="three-top-nav-links">
        <router-link v-bind:to="{ name: 'whoWeAre' }" tag="li">WHO we are</router-link>
      </li>
      <li class="three-top-nav-links">
        <router-link v-bind:to="{ name: 'eventsAdoption' }" tag="li">EVENTS adoption</router-link>
      </li>
    </ul>
  </red-nav-bar>
</template>



<script>
import RedNavBar from "../components/RedNavBar.vue";

export default {
  components: {
    RedNavBar
  },
  name: "TopNavBar"
};
</script>


<style  lang="scss">
.three-top-nav-links {
  font-weight: bold;
  display: inline-flex;
  align-content: center;
  justify-content: space-around;
  font-size: 1.5rem;
}

.top-navbar {
  height: fit-content;
  font-family: $font-family-secondary;
}

#adopt-me {
  font-weight: normal;
}

#logo-url {
  font-size: 2rem;
}

@media only screen and (min-device-width: 320px) {
  .left-column {
    grid-area: leftColumn;
    display: inline-block;
  }
  .three-top-nav-links {
    padding-right: 1rem;
    padding-left: 1rem;
    grid-area: threeLinks;
    flex-wrap: nowrap;
  }

  .top-navbar {
    @include navbarGrid;
  }
  #adopt-me {
    padding-left: 10px;
  }
}
@media only screen and (min-width: 768px) {
  .three-top-nav-links {
    padding-right: 1rem;
    padding-left: 2rem;
  }
  #adopt-me {
    padding-left: 10px;
  }
}
@media only screen and (min-width: 1224px) {
  #adopt-me {
    padding-left: 0.5rem;
  }
  .three-top-nav-links {
    padding-right: 2rem;
    padding-left: 4rem;
  }
}
</style>

