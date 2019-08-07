<template>
  <red-nav-bar>
    <ul class="list-inline">
      <li class="navbar-brand">
        <router-link v-bind:to="{ name: 'home' }" tag="li" exact>Adoptme.Org</router-link>
      </li>
      <li class="nav-item">
        <router-link v-bind:to="{ name: 'whatWeDo' }" tag="li">WHAT we do</router-link>
      </li>
      <li class="nav-item">
        <router-link v-bind:to="{ name: 'whoWeAre' }" tag="li">WHO we are</router-link>
      </li>
      <li class="nav-item">
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
.red-nav-bar {
  display: flex;
  justify-content: space-between;
  flex-wrap: nowrap;
  margin: 0px;
}

.navbar-brand {
  font-size: 1.5rem;
  font-weight: light;
}
</style>