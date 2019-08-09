<template>
  <div class="list-row">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "SingleRowOfList"
};
</script>

<style>
.list-row {
  height: fit-content;
  padding-top: 20px;
}
</style>
