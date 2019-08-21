<template>
  <div id="app">
    <h1>Event Binding Examples</h1>

    <div class="example">
      <h4>Inline</h4>
      <div class="current-count">{{ count }}</div>
      <button v-on:click="count++">Increment</button>
      <button v-on:click="count--">Decrement</button>
    </div>

    <div class="example">
      <h4>Named Method</h4>
      <div class="current-count">{{ count }}</div>
      <button v-on:click="incrementCount">Increment</button>
      <button v-on:click="decrementCount">Decrement</button>
    </div>

    <div class="example">
      <h4>Named Method - With Explicit Arguments</h4>
      <div class="current-count">{{ count }}</div>
      <button v-on:click="addToCount(5)">Increment</button>
      <button v-on:click="addToCount(-1)">Decrement</button>
    </div>

    <div class="example">
      <h4>Named Method - With Explicit Arguments Passing Along the Event Object</h4>
      <div class="current-count">{{ count }}</div>
      <button v-on:click="addToCount(5, $event)">Increment</button>
      <button v-on:click="addToCount(-1, $event)">Decrement</button>
    </div>

    <div class="example">
      <h4>Event Modifier - .once</h4>
      <p>The event has been fired {{ timesEventFired }} time{{ timesEventFired === 0 ? 's' : ''}}.</p>
      <button v-on:click.once="handleOnce">Click No More Than Once</button>
    </div>

    <div class="example">
      <h4>Prevent Default</h4>
      <p>
        <a
          @click="handleLinkClick"
          href="https://www.techelevator.com"
          target="_"
        >You can click on this link.</a>
      </p>
      <p>
        <a
          @click.prevent="handleLinkClick"
          href="https://www.google.com"
          target="_"
        >But you cannot click on this link...</a>
      </p>
    </div>

    <div class="example">
      <h4>Stop Propogation</h4>
      <h5>Without Stopping on the Inner Box</h5>
      <div class="outer-box" v-on:click="handleBoxClicked('outer')">
        <div class="inner-box" v-on:click="handleBoxClicked('inner')"></div>
      </div>

      <h5>Stop Event Propogation on the Inner Box</h5>
      <div class="outer-box" v-on:click="handleBoxClicked('outer')">
        <div class="inner-box" v-on:click.stop="handleBoxClicked('inner')"></div>
      </div>
    </div>

    <div class="example">
      <h4>Self</h4>
      <h5>Without Using Self</h5>
      <p>The event will be fired on the outer box even when the inner box is clicked.</p>
      <div class="outer-box" v-on:click="handleBoxClicked('outer')">
        <div class="inner-box"></div>
      </div>

      <h5>Using Self on the Outer Box</h5>
      <p>The event will only be fired when the outer box itself is actually clicked.</p>
      <div class="outer-box" v-on:click.self="handleBoxClicked('outer')">
        <div class="inner-box"></div>
      </div>
    </div>

    <div class="example">
      <h4>Key Events</h4>
      <input placeholder="Enter some text here" v-on:keyup="logKeyEvent" />
      <h5>Log:</h5>
      <div class="key-log" v-if="keyEvents.length > 0">
        <p v-for="keyEvent in keyEvents" :key="keyEvent.id">{{ keyEvent.key }}</p>
      </div>

      <!-- Only log values that are h or a -->
      <input placeholder="Enter some text here" v-on:keyup.h.a="logKeyEvent" />
      <h5>Log:</h5>
      <div class="key-log" v-if="keyEvents.length > 0">
        <p v-for="keyEvent in keyEvents" :key="keyEvent.id">{{ keyEvent.key }}</p>
      </div>
    </div>

    <div class="example">
      <h4>Mouse Events</h4>
      <p>When we move the mouse over the outer box, the inner box should be displayed.</p>
      <p>When we click on the box, the color of the outer box should toggle between yellow and orange.</p>
      <div
        v-bind:style="outerboxStyle"
        class="outer-box"
        @mouseover="hovering = true"
        @mouseleave="hovering = false"
        @mousedown="isYellow = !isYellow"
      >
        <div class="inner-box" v-show="hovering"></div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  computed: {
    outerboxStyle() {
      if (this.isYellow) {
        return {
          backgroundColor: "yellow"
        };
      }
      return null;
    }
  },
  data() {
    return {
      count: 0,
      hovering: false,
      isYellow: false,
      keyEvents: [],
      timesEventFired: 0
    };
  },
  methods: {
    addToCount(value, evt) {
      console.log("addToCount", evt);
      this.count += value;
    },
    decrementCount(evt) {
      console.log(evt);
      console.log("decrement");
      this.count--;
    },
    handleBoxClicked(element) {
      console.log(`The ${element} box was clicked.`);
    },
    handleLinkClick(evt) {
      console.log("You've just clicked a link!!!", evt.target.href);
    },
    handleOnce() {
      console.log("handleOnce");
      this.timesEventFired++;
    },
    incrementCount() {
      console.log("increment");
      this.count++;
    },
    logKeyEvent(event) {
      console.log(event, event.key);
      this.keyEvents.push({
        key: event.key,
        id: `_${Math.random()
          .toString(36)
          .substr(2, 9)}`
      });
    }
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.current-count {
  border: 1px solid lightgray;
  width: 20%;
  margin: 0 auto;
  border-radius: 10px;
  height: 50px;
  background-color: beige;
  text-align: center;
  font-size: 1.8em;
  padding: 10px;
  vertical-align: middle;
  line-height: 50px;
}

.example {
  padding: 10px;
  margin: 10px;
  border: 1px solid lightskyblue;
}

.example button {
  margin: 10px;
}

.key-log {
  border: 1px solid green;
  background-color: black;
  font-family: Lucida Console, Lucida Sans Typewriter, monaco,
    Bitstream Vera Sans Mono, monospace, Ubuntu, Cantarell, "Open Sans",
    "Helvetica Neue", sans-serif;
  color: greenyellow;
  border-radius: 10px;
  margin: 10px;
}

.outer-box {
  width: 100px;
  height: 100px;
  margin: 0 auto;
  background-color: orange;
  display: flex;
  align-items: center;
  justify-content: center;
}

.inner-box {
  width: 50%;
  height: 50%;
  background-color: purple;
}
</style>
