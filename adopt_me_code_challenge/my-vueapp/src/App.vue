<template>
  <div id="app">
    <link
      href="https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300|Open+Sans:400,700"
      rel="stylesheet"
    >
    <top-nav-bar></top-nav-bar>

    <router-view/>
  </div>
</template>

<script>
import TopNavBar from "@/components/TopNavBar.vue";
import BlueNavBar from "@/components/BlueNavBar.vue";

export default {
  components: {
    TopNavBar
  }
};
</script>

<style lang="scss">
@include h1Font;
@include h2Font;

body,
div {
  font-family: $font-family-primary;
  margin: 0px;
}

#app {
  font-family: $font-family-primary;
}

.nav-logo {
  max-height: 50px;
  max-width: 50px;
}
</style>
