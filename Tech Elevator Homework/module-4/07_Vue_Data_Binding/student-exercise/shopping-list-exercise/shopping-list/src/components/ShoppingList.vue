<template>
  <div class="shopping-list">
    <h1>My Shopping List</h1>
    <ul>
      <li
        v-for="item in groceries"
        v-bind:key="item"
        v-bind:class="{ completed: item.completed }"
      >{{item.item}}</li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      groceries: [
        { item: "milk", completed: true },
        { item: "eggs", completed: true },
        { item: "flour", completed: true },
        { item: "yeast", completed: false },
        { item: "apple butter", completed: false },
        { item: "plain cream cheese", completed: true },
        { item: "1 bag of shredded cheddar cheese", completed: true },
        { item: "1 yellow onion", completed: false },
        { item: "1 bag of whole pecans", completed: true }
      ]
    };
  }
};
</script>

<style>
.shopping-list {
  width: 450px;
  background: #fff;
  margin: 50px auto;
  font-family: "Roboto Condensed", sans-serif;
  border-radius: 10px;
}
h1 {
  background: #f2f2f2;
  color: #5c8578;
  padding: 10px;
  font-size: 24px;
  text-transform: uppercase;
  text-align: center;
  margin-bottom: 0px;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
}
ul {
  list-style-type: none;
  margin: 0px;
  padding: 0px;
}
li {
  font-size: 24px;
  border-bottom: 1px solid #f2f2f2;
  padding: 10px 20px;
}
li:last-child {
  border: 0px;
}
li.completed {
  text-decoration: line-through;
  color: darkgrey;
}
</style>
