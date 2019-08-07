<template>
  <nav class="navbar-dark">
    <slot></slot>
  </nav>
</template>
    

<script>
export default {
  name: "RedNavBar"
};
</script>

<style lang="scss">
nav {
  @include navbarLinks;
  background-color: $color-red;
  max-height: 5%;
}
</style>