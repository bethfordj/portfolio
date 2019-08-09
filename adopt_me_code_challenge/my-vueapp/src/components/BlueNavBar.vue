<template>
  <nav class="navbar-blue">
    <slot></slot>
  </nav>
</template>
    

<script>
export default {
  name: "BlueNavBar"
};
</script>

<style lang="scss">
.navbar-blue {
  @include navbarLinks;
  background-color: $color-blue;
  color: $nav-text-color;
}
</style>