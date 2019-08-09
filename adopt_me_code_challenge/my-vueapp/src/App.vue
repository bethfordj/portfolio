<template>
  <div id="app">
    <link
      href="https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300|Open+Sans:400,700"
      rel="stylesheet"
    >
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
h1 {
  @include h1Font;
}

h2 {
  @include h2Font;
}

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