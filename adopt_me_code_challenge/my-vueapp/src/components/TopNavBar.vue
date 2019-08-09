<template>
  <red-nav-bar class="top-navbar">
    <ul>
      <li class="navbar-brand">
        <router-link id="logo-url" v-bind:to="{ name: 'home' }" tag="li" exact>
          <p id="adopt-me">
            <img class="nav-logo" src="@/assets/img/logo.png">Adoptme.Org
          </p>
        </router-link>
      </li>
      <li class="three-top-nav-links">
        <router-link v-bind:to="{ name: 'whatWeDo' }" tag="li">
          <p>WHAT we do</p>
        </router-link>
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
li {
  display: inline-flex;
  align-content: center;
  justify-content: space-around;
  font-size: 1.5rem;
}

.three-top-nav-links {
  padding-right: 2rem;
  padding-left: 4rem;
  font-weight: bold;
}

.top-navbar {
  height: fit-content;
  font-family: $font-family-secondary;
}

#adopt-me {
  padding-left: 0.5rem;
  font-weight: normal;
}

#logo-url {
  font-size: 2rem;
  padding-right: 25rem;
}
</style>

