<template>
  <navbar class="navbar-dark">
    <slot></slot>
  </navbar>
</template>
    

<script>
export default {
  name: "BlueNavBar"
};
</script>

<style lang="scss">
.navbar-dark {
  @include navbarLinks;
  background-color: $color-red;
}
</style>