<template>
  <nav class="navbar-red">
    <slot></slot>
  </nav>
</template>
    

<script>
export default {
  name: "RedNavBar"
};
</script>

<style lang="scss">
.navbar-red {
  @include navbarLinks;
  background-color: $color-red;
  max-height: 5%;
}
</style>