<template>
  <div id="app">
    <product-review></product-review>
  </div>
</template>

<script>
import ProductReview from '@/components/ProductReview.vue'

export default {
  name: 'app',
  components: {
    ProductReview
  }
}
</script>

<style>
#app {
  width: 800px;
  margin: auto;
}
</style>
