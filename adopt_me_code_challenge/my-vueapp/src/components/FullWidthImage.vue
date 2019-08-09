<template>
  <div class="full-width-media">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "FullWidthMedia"
};
</script>

<style lang="scss">
.full-width-media {
  overflow: hidden;
  margin: 0;
  max-height: 33rem;
}
</style>