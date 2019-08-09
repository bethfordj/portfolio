<template>
  <div class="two-cards">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "TwoCardDisplay"
};
</script>

<style>
.two-cards {
  display: flex;
  width: 100%;
  justify-content: space-around;
  align-content: flex-start;
  margin: 10px;
}
</style>