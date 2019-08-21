<template>
  <div id="app">
    <header>
      <top-navigation/>
    </header>
    <router-view class="content"/>
  </div>
</template>

<script>
import TopNavigation from "../../components/TopNavigation";

export default {
  components: {
    TopNavigation
  }
};
</script>


<style>
#app {
  display: flex;
  flex-direction: column;
}

header {
  background-color: darkorange;
}

.content {
  width: 800px;
  margin: 20px;
  align-self: center;
}
</style>
