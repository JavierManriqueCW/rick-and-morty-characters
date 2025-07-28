<div id="top">

<!-- HEADER STYLE: CLASSIC -->
<div align="center">

<img src="https://github.com/user-attachments/assets/5def7255-d94d-4f6c-8387-b4835d0bb03c" width="30%" style="position: relative; top: 0; right: 0;" alt="Project Logo"/>

# Rick & Morty Characters!

<em></em>

<!-- BADGES -->
<img src="https://img.shields.io/github/license/JavierManriqueCW/rick-and-morty-characters?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
<img src="https://img.shields.io/github/last-commit/JavierManriqueCW/rick-and-morty-characters?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
<img src="https://img.shields.io/github/languages/top/JavierManriqueCW/rick-and-morty-characters?style=default&color=0080ff" alt="repo-top-language">
<img src="https://img.shields.io/github/languages/count/JavierManriqueCW/rick-and-morty-characters?style=default&color=0080ff" alt="repo-language-count">

<!-- default option, no dependency badges. -->


<!-- default option, no dependency badges. -->

</div>
<br>

---

## Table of Contents

- [Table of Contents](#table-of-contents)
- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
    - [Project Index](#project-index)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)

---

## Overview



---

## Features

|      | Component       | Details                              |
| :--- | :-------------- | :----------------------------------- |
| ⚙️  | **Architecture**  | <ul><li>Written in Kotlin</li><li>Follows MVVM architecture</li><li>Uses Jetpack Compose</li></ul> |
| 🔩 | **Code Quality**  | <ul><li>Consistent naming conventions</li><li>Well-structured project with clear separation of concerns</li></ul> |
| 📄 | **Documentation** | <ul><li>Code is self-documenting with meaningful variable and function names</li></ul> |
| 🧩 | **Modularity**    | <ul><li>Code is modular with separate packages for different features</li><li>Uses Gradle modules for separation of concerns</li></ul> |
| 📦 | **Dependencies**  | <ul><li>Managed by Gradle</li><li>Dependencies include Android Jetpack libraries, Kotlin standard library, and others</li></ul> |
| 🚀 | **Scalability**   | <ul><li>Modular architecture allows for easy feature addition</li><li>Scalable UI with Jetpack Compose</li></ul> |


---

## Project Structure

```sh
└── rick-and-morty-characters/
    ├── app
    │   ├── .gitignore
    │   ├── build.gradle.kts
    │   └── src
    ├── build.gradle.kts
    ├── common
    │   ├── build.gradle.kts
    │   ├── di
    │   └── model
    ├── data
    │   ├── build.gradle.kts
    │   └── src
    ├── domain
    │   ├── build.gradle.kts
    │   └── src
    ├── gradle
    │   ├── libs.versions.toml
    │   └── wrapper
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    └── settings.gradle
```

### Project Index

<details open>
	<summary><b><code>Rick & Morty Characters/</code></b></summary>
	<!-- __root__ Submodule -->
	<details>
		<summary><b>Root</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ root</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/build.gradle.kts'>build.gradle.kts</a></b></td>
					<td style='padding: 8px;'>- Build.gradle.kts orchestrates the projects build process, defining the plugins and dependencies required<br>- It sets the Java version compatibility and specifies the repositories for dependencies<br>- This file is crucial for configuring the build system and managing libraries in the project.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/gradlew.bat'>gradlew.bat</a></b></td>
					<td style='padding: 8px;'>- Gradlew.bat serves as a Gradle startup script specifically for Windows<br>- It sets up the environment, resolves Java dependencies, and initiates the Gradle Wrapper<br>- This script is crucial for building the project, ensuring that the correct version of Gradle is used regardless of the developers local setup.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/settings.gradle'>settings.gradle</a></b></td>
					<td style='padding: 8px;'>- Settings.gradle orchestrates the build configuration for the RickAndMortyCharacters project<br>- It manages plugin and dependency resolution, ensuring the correct repositories are used<br>- It also defines the projects structure, including the root and module-level components such as app', domain, data, and various common modules.</td>
				</tr>
			</table>
		</blockquote>
	</details>
	<!-- app Submodule -->
	<details>
		<summary><b>app</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ app</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/proguard-rules.pro'>proguard-rules.pro</a></b></td>
					<td style='padding: 8px;'>- ProGuard rules, defined in the app/proguard-rules.pro file, manage the obfuscation and optimization of the Android application<br>- They control configurations applied in build.gradle.kts, preserve debugging information, and facilitate JavaScript interface for WebView<br>- The rules also help in concealing the original source file name, enhancing the security of the application.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/build.gradle.kts'>build.gradle.kts</a></b></td>
					<td style='padding: 8px;'>- App/build.gradle.kts configures the Android application module of the Rick and Morty Characters project<br>- It sets up the Android environment, specifies the SDK versions, enables features like view binding and compose, and defines the dependencies required<br>- This file plays a crucial role in building and running the application successfully.</td>
				</tr>
			</table>
			<!-- src Submodule -->
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ app.src</b></code>
					<!-- main Submodule -->
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ app.src.main</b></code>
							<table style='width: 100%; border-collapse: collapse;'>
							<thead>
								<tr style='background-color: #f8f9fa;'>
									<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
									<th style='text-align: left; padding: 8px;'>Summary</th>
								</tr>
							</thead>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/AndroidManifest.xml'>AndroidManifest.xml</a></b></td>
									<td style='padding: 8px;'>- The AndroidManifest.xml in the RickAndMortyCharacters application serves as the central configuration file<br>- It manages permissions, such as internet access and network state, and defines application components like activities<br>- It also specifies the applications theme, icons, and backup rules<br>- The manifest designates SplashActivity as the initial activity launched, with MainActivity as another key activity.</td>
								</tr>
							</table>
							<!-- kotlin Submodule -->
							<details>
								<summary><b>kotlin</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ app.src.main.kotlin</b></code>
									<!-- com Submodule -->
									<details>
										<summary><b>com</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.kotlin.com</b></code>
											<!-- jmp Submodule -->
											<details>
												<summary><b>jmp</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ app.src.main.kotlin.com.jmp</b></code>
													<!-- rickandmortycharacters Submodule -->
													<details>
														<summary><b>rickandmortycharacters</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/RickAndMortyCharactersApplication.kt'>RickAndMortyCharactersApplication.kt</a></b></td>
																	<td style='padding: 8px;'>- RickAndMortyCharactersApplication serves as the entry point for the Android application, initializing the dependency injection framework, Koin<br>- It sets up the application context and loads the necessary modules for the apps operation<br>- This setup ensures that all dependencies are correctly provided throughout the application, facilitating efficient and organized code management.</td>
																</tr>
															</table>
															<!-- onboarding Submodule -->
															<details>
																<summary><b>onboarding</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.onboarding</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/onboarding/OnboardingStepScreen.kt'>OnboardingStepScreen.kt</a></b></td>
																			<td style='padding: 8px;'>- OnboardingStepScreen in the Rick and Morty Characters app serves as a key component in the user onboarding process<br>- It displays an image, title, and description in a centered layout, providing a visually engaging introduction to the apps features<br>- This component enhances user experience by guiding new users through the initial stages of app interaction.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/onboarding/OnboardingCarouselScreen.kt'>OnboardingCarouselScreen.kt</a></b></td>
																			<td style='padding: 8px;'>- OnboardingCarouselScreen.kt in the Rick and Morty Characters app serves as the onboarding interface for new users<br>- It guides users through two introductory screens, providing an overview of the apps features<br>- The screen also includes navigation controls, allowing users to proceed to the next screen or skip the onboarding process entirely.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- main Submodule -->
															<details>
																<summary><b>main</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.main</b></code>
																	<!-- viewmodel Submodule -->
																	<details>
																		<summary><b>viewmodel</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.main.viewmodel</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/main/viewmodel/MainViewModel.kt'>MainViewModel.kt</a></b></td>
																					<td style='padding: 8px;'>- MainViewModel in the Rick and Morty Characters app manages user onboarding preferences<br>- It determines the start destination screen based on whether the user should see the onboarding screen or not<br>- Additionally, it provides functionality to disable the onboarding screen, enhancing user experience by avoiding repetitive onboarding for returning users.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- view Submodule -->
																	<details>
																		<summary><b>view</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.main.view</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/main/view/MainActivity.kt'>MainActivity.kt</a></b></td>
																					<td style='padding: 8px;'>- MainActivity serves as the primary user interface in the Rick and Morty Characters application<br>- It orchestrates the navigation between different screens such as Onboarding, Characters List, and Character Detail<br>- It also interacts with the MainViewModel to manage application data and state, ensuring a seamless user experience.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- list Submodule -->
															<details>
																<summary><b>list</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.list</b></code>
																	<!-- viewmodel Submodule -->
																	<details>
																		<summary><b>viewmodel</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.list.viewmodel</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/list/viewmodel/ListViewModel.kt'>ListViewModel.kt</a></b></td>
																					<td style='padding: 8px;'>- ListViewModel serves as the intermediary between the UI and the data layer for the Rick and Morty character list<br>- It manages UI states, fetches character lists, and handles state updates<br>- Additionally, it provides a reload function to force a remote data fetch<br>- This component is crucial in maintaining a responsive and accurate user interface.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- state Submodule -->
																	<details>
																		<summary><b>state</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.list.state</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/list/state/ListUiState.kt'>ListUiState.kt</a></b></td>
																					<td style='padding: 8px;'>- A raw list of all characters and a filtered list based on user interactions<br>- This state management is crucial for the applications responsiveness and user experience.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- view Submodule -->
																	<details>
																		<summary><b>view</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.list.view</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/list/view/ListScreen.kt'>ListScreen.kt</a></b></td>
																					<td style='padding: 8px;'>- ListScreen.kt in the Rick and Morty Characters project serves as the main user interface for displaying a list of characters<br>- It handles different states such as loading, success, and error, and provides a search functionality to filter characters<br>- It also navigates to a detailed view when a character is selected.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/list/view/SearchBar.kt'>SearchBar.kt</a></b></td>
																					<td style='padding: 8px;'>- SearchBar.kt, located in the view package of the Rick and Morty Characters application, provides a user interface component for character search functionality<br>- It defines a Composable function that creates a search bar, allowing users to input text and search for characters<br>- The search bar includes a leading search icon and custom styling for various states, enhancing the user experience.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/list/view/ListItem.kt'>ListItem.kt</a></b></td>
																					<td style='padding: 8px;'>- ListItem.kt in the Rick and Morty Characters project is a Kotlin Composable function that displays a list item for a character<br>- It handles the visual representation of a character, including the characters image and name, and manages animations for the items visibility and size<br>- It also triggers an action when a character is clicked.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- detail Submodule -->
															<details>
																<summary><b>detail</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.detail</b></code>
																	<!-- viewmodel Submodule -->
																	<details>
																		<summary><b>viewmodel</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.detail.viewmodel</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/detail/viewmodel/DetailViewModel.kt'>DetailViewModel.kt</a></b></td>
																					<td style='padding: 8px;'>- DetailViewModel serves as the main orchestrator for character detail operations in the Rick and Morty Characters application<br>- It leverages the GetListState interactor to fetch character details, manages UI state updates, and handles potential errors such as character not found scenarios.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- state Submodule -->
																	<details>
																		<summary><b>state</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.detail.state</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/detail/state/DetailUiState.kt'>DetailUiState.kt</a></b></td>
																					<td style='padding: 8px;'>- DetailUiState.kt, located in the detail.state package, encapsulates the state of the UI for character details in the Rick and Morty Characters application<br>- It holds an instance of a Character model, providing a clear and concise way to manage and represent the state of individual character details within the application.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- view Submodule -->
																	<details>
																		<summary><b>view</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.detail.view</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/detail/view/DetailScreen.kt'>DetailScreen.kt</a></b></td>
																					<td style='padding: 8px;'>- DetailScreen.kt serves as a detailed view component in the Rick and Morty Characters application<br>- It displays specific character information, handling different UI states such as loading, success, and error<br>- The file leverages Jetpack Compose for UI design and interacts with the DetailViewModel to fetch and present character data.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- common Submodule -->
															<details>
																<summary><b>common</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.common</b></code>
																	<!-- di Submodule -->
																	<details>
																		<summary><b>di</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.common.di</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/common/di/KoinDependencies.kt'>KoinDependencies.kt</a></b></td>
																					<td style='padding: 8px;'>- KoinDependencies.kt orchestrates the dependency injection for the Rick and Morty Characters application<br>- It consolidates the modules required for the application, including CoreDependencies and view models such as SplashViewModel, MainViewModel, ListViewModel, and DetailViewModel<br>- This ensures that all dependencies are correctly provided where needed, contributing to the overall maintainability and scalability of the codebase.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- compose Submodule -->
																	<details>
																		<summary><b>compose</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.common.compose</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/common/compose/Colors.kt'>Colors.kt</a></b></td>
																					<td style='padding: 8px;'>- Colors.kt in the Rick and Morty Characters app serves as a centralized repository for color definitions<br>- It defines color values used throughout the application, ensuring consistency in the visual design<br>- These colors are applied to various elements, such as the top bar background and onboarding button, enhancing the user interfaces aesthetics and readability.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/common/compose/Dimensions.kt'>Dimensions.kt</a></b></td>
																					<td style='padding: 8px;'>- Dimensions.kt in the common.compose package defines various dimension constants for the Rick and Morty Characters application<br>- These constants, expressed in density-independent pixels (dp), standardize padding, height, dot size, and list item image border width across the application, ensuring consistent UI design.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/common/compose/ComposeFunctions.kt'>ComposeFunctions.kt</a></b></td>
																					<td style='padding: 8px;'>- ComposeFunctions.kt in the Rick and Morty Characters project provides utility functions for UI modifications and user interactions<br>- It includes functions for creating a fading edge effect, clearing focus on tap, and debouncing click events<br>- These functions enhance the user interface and improve the user experience by managing rapid interactions and visual effects.</td>
																				</tr>
																			</table>
																			<!-- view Submodule -->
																			<details>
																				<summary><b>view</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.common.compose.view</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/common/compose/view/ErrorScreen.kt'>ErrorScreen.kt</a></b></td>
																							<td style='padding: 8px;'>- ErrorScreen in the Rick and Morty Characters application serves as a user interface component that displays error messages<br>- It provides a customizable error message and an optional reload button, which triggers a function to retry the failed operation<br>- This component enhances user experience by handling errors gracefully and providing recovery options.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/common/compose/view/TopBar.kt'>TopBar.kt</a></b></td>
																							<td style='padding: 8px;'>- TopBar.kt, located in the common.compose.view package, serves as a reusable component for the applications top navigation bar<br>- It provides a back button and a logo, with the back buttons functionality being customizable<br>- This component is designed with the Jetpack Compose UI toolkit, ensuring a consistent look and feel across the application.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/common/compose/view/LoadingScreen.kt'>LoadingScreen.kt</a></b></td>
																							<td style='padding: 8px;'>- LoadingScreen.kt, located in the common.compose.view package, serves as a visual indicator for loading states within the Rick and Morty Characters application<br>- It displays a centered Loading..<br>- text on the screen, providing users with feedback that content is being processed or fetched, enhancing the overall user experience.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																	<!-- navigation Submodule -->
																	<details>
																		<summary><b>navigation</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.common.navigation</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/common/navigation/Screen.kt'>Screen.kt</a></b></td>
																					<td style='padding: 8px;'>- Screen.kt in the navigation package defines the navigation routes and arguments for the Rick and Morty Characters app<br>- It includes routes for onboarding, character listing, and character detail screens<br>- The character detail screen route uses a dynamic argument for character ID.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- state Submodule -->
																	<details>
																		<summary><b>state</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.common.state</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/common/state/ResourceState.kt'>ResourceState.kt</a></b></td>
																					<td style='padding: 8px;'>- Success, Loading, and Error<br>- This approach simplifies handling of network responses throughout the Rick and Morty Characters application.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- splash Submodule -->
															<details>
																<summary><b>splash</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.splash</b></code>
																	<!-- viewmodel Submodule -->
																	<details>
																		<summary><b>viewmodel</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.splash.viewmodel</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/splash/viewmodel/SplashViewModel.kt'>SplashViewModel.kt</a></b></td>
																					<td style='padding: 8px;'>- SplashViewModel, located in the Splash module of the Rick and Morty Characters app, manages the lifecycle-aware operations<br>- It primarily handles the loading of character lists, leveraging the FetchList interactor<br>- The ViewModel employs Kotlins coroutines for asynchronous tasks, ensuring a smooth user experience during data retrieval, regardless of the data source.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- view Submodule -->
																	<details>
																		<summary><b>view</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ app.src.main.kotlin.com.jmp.rickandmortycharacters.splash.view</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/kotlin/com/jmp/rickandmortycharacters/splash/view/SplashActivity.kt'>SplashActivity.kt</a></b></td>
																					<td style='padding: 8px;'>- SplashActivity serves as the entry point of the Rick and Morty Characters application, displaying a splash screen while loading the character list<br>- It leverages the SplashViewModel to fetch data and then navigates to the MainActivity once the data is loaded<br>- This activity also ensures a seamless transition between the splash screen and the main content.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
							<!-- res Submodule -->
							<details>
								<summary><b>res</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ app.src.main.res</b></code>
									<!-- drawable-v24 Submodule -->
									<details>
										<summary><b>drawable-v24</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.res.drawable-v24</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/drawable-v24/ic_launcher_foreground.xml'>ic_launcher_foreground.xml</a></b></td>
													<td style='padding: 8px;'>- The ic_launcher_foreground.xml file serves as the primary vector drawable resource for the applications launcher icon<br>- It defines the icons shape, size, and color gradient<br>- This resource is crucial for the application's visual identity, as it appears on the user's device home screen or application list upon installation.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- values-w600dp Submodule -->
									<details>
										<summary><b>values-w600dp</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.res.values-w600dp</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/values-w600dp/dimens.xml'>dimens.xml</a></b></td>
													<td style='padding: 8px;'>- Dimens.xml in the values-w600dp directory defines dimensions for specific UI elements in the application<br>- It primarily sets the margin for the floating action button (FAB) to 48dp<br>- This configuration ensures optimal spacing and alignment of the FAB on devices with a minimum width of 600dp.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- drawable Submodule -->
									<details>
										<summary><b>drawable</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.res.drawable</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/drawable/ic_from.xml'>ic_from.xml</a></b></td>
													<td style='padding: 8px;'>- The ic_from.xml vector drawable, located in the apps main resources, serves as a graphical representation within the application<br>- Its a complex shape, defined by two path elements, and is used to enhance the user interface<br>- This drawable contributes to the overall aesthetics and user experience of the application.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/drawable/ic_sex.xml'>ic_sex.xml</a></b></td>
													<td style='padding: 8px;'>- The ic_sex.xml file, located in the drawable resources directory, defines a vector graphic used within the application<br>- This graphic is scalable without losing quality, making it ideal for various display sizes and resolutions<br>- The graphic is likely used to represent or signify gender or sex-related features or functionalities in the application.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/drawable/ic_location.xml'>ic_location.xml</a></b></td>
													<td style='padding: 8px;'>- The ic_location.xml file, located in the drawable resources directory, defines a vector graphic for a location icon<br>- This icon is used throughout the application to visually represent location-related data or functionality<br>- The graphic is scalable, ensuring it maintains quality across different screen resolutions and sizes.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/drawable/ic_status.xml'>ic_status.xml</a></b></td>
													<td style='padding: 8px;'>- Leveraging Androids Vector Drawable, ic_status.xml provides a scalable graphic for the applications status icon<br>- It's designed with a specific path and fill color, contributing to the overall user interface aesthetics<br>- Positioned in the drawable resources directory, it's readily accessible for use throughout the application, enhancing visual consistency.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/drawable/ic_alien.xml'>ic_alien.xml</a></b></td>
													<td style='padding: 8px;'>- Incorporating a vector graphic, ic_alien.xml serves as a visual asset within the apps user interface<br>- It defines an alien icon with specific dimensions and path data, contributing to the overall aesthetic and user experience<br>- Positioned in the drawable directory, its readily accessible for use across various components of the application.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/drawable/splash_background.xml'>splash_background.xml</a></b></td>
													<td style='padding: 8px;'>- Splash_background.xml serves as the visual representation during the applications launch phase<br>- It creates a layered drawable, with a base color and a centered bitmap image, contributing to the overall user experience by providing a visually appealing introduction to the Rick and Morty application.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/drawable/ic_rym_background.xml'>ic_rym_background.xml</a></b></td>
													<td style='padding: 8px;'>- The ic_rym_background.xml file serves as a vector drawable resource within the Android application<br>- It defines a grid-like background pattern with a specific color scheme<br>- This pattern is used across the application to maintain a consistent and visually appealing user interface.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/drawable/ic_launcher_background.xml'>ic_launcher_background.xml</a></b></td>
													<td style='padding: 8px;'>- The <code>ic_launcher_background.xml</code> serves as the primary vector drawable resource for the applications launcher icon background<br>- It defines a grid-like pattern with a green background, using various paths and strokes<br>- This resource contributes to the visual identity of the application, enhancing user recognition and experience.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- layout Submodule -->
									<details>
										<summary><b>layout</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.res.layout</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/layout/content_main.xml'>content_main.xml</a></b></td>
													<td style='padding: 8px;'>- Content_main.xml serves as the primary layout file in the Android application, housing the main navigation host fragment<br>- It utilizes a ConstraintLayout to ensure flexible and responsive UI design<br>- The embedded NavHostFragment manages app navigation, referencing the navigation graph for defining all possible paths.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/layout/activity_main.xml'>activity_main.xml</a></b></td>
													<td style='padding: 8px;'>- Activity_main.xml serves as the primary layout file for the main activity in the application<br>- It defines the user interface structure, including a toolbar, a floating action button, and a content area<br>- This layout is crucial in providing a consistent and intuitive user experience across the application.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- values-land Submodule -->
									<details>
										<summary><b>values-land</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.res.values-land</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/values-land/dimens.xml'>dimens.xml</a></b></td>
													<td style='padding: 8px;'>- Defining landscape-specific dimensions, the dimens.xml file located in the values-land directory sets the margin for the Floating Action Button (FAB) to 48dp<br>- This configuration ensures consistent spacing and layout across various landscape-oriented screen sizes, contributing to the overall user interface design of the application.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- values Submodule -->
									<details>
										<summary><b>values</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.res.values</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/values/colors.xml'>colors.xml</a></b></td>
													<td style='padding: 8px;'>- Colors.xml serves as the central repository for color definitions in the application<br>- It defines a palette of colors, including various shades of purple, teal, black, white, and a custom blue<br>- These color resources are used throughout the application to ensure consistency and ease of maintenance in the UI design.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/values/dimens.xml'>dimens.xml</a></b></td>
													<td style='padding: 8px;'>- Dimens.xml, located in the app/src/main/res/values directory, serves as a centralized location for defining dimensional values<br>- It primarily contributes to maintaining consistency and reusability in the applications user interface by storing a standard margin value for floating action buttons (FABs).</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/values/themes.xml'>themes.xml</a></b></td>
													<td style='padding: 8px;'>- Themes.xml in the app/src/main/res/values directory defines the base application theme for the RickAndMortyCharacters project<br>- It sets primary, secondary, and status bar colors, inheriting from the Material3.DayNight.NoActionBar theme<br>- This file plays a crucial role in maintaining the visual consistency and brand identity throughout the application.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/values/styles.xml'>styles.xml</a></b></td>
													<td style='padding: 8px;'>- Defining the visual aspects of the applications splash screen, styles.xml in the app/src/main/res/values directory sets the background color, animated icon, and post-splash screen theme<br>- It contributes to the overall user experience by providing a smooth transition from the splash screen to the main application interface.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/values/strings.xml'>strings.xml</a></b></td>
													<td style='padding: 8px;'>- Containing all the string resources for the Rick & Morty Characters application, the strings.xml file in the values directory provides text for UI elements such as activity titles, navigation labels, and error messages<br>- It plays a crucial role in maintaining a clean architecture and enabling localization of the application.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- navigation Submodule -->
									<details>
										<summary><b>navigation</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.res.navigation</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/navigation/nav_graph.xml'>nav_graph.xml</a></b></td>
													<td style='padding: 8px;'>- Navigating the Rick and Morty Characters application is managed by the nav_graph.xml file<br>- It defines the applications start destination as the CharactersFragment and outlines the navigation flow between the CharactersFragment and CharacterDetailFragment<br>- This ensures a seamless user experience when transitioning between the list of characters and their detailed views.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- xml Submodule -->
									<details>
										<summary><b>xml</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.res.xml</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/xml/backup_rules.xml'>backup_rules.xml</a></b></td>
													<td style='padding: 8px;'>- Backup_rules.xml, located in the app/src/main/res/xml directory, outlines the rules for automatic data backup in the Android application<br>- Its designed to include or exclude specific shared preferences from the backup process<br>- However, its important to note that these rules are not applicable for devices running on APIs older than 31.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/xml/data_extraction_rules.xml'>data_extraction_rules.xml</a></b></td>
													<td style='padding: 8px;'>- DataExtractionRules.xml, located in the apps resources, outlines the rules for data backup and transfer<br>- It provides a framework for specifying what data should be included or excluded during cloud backup or device transfer operations<br>- This is crucial for managing data persistence and migration in the Android application.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- values-w1240dp Submodule -->
									<details>
										<summary><b>values-w1240dp</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.res.values-w1240dp</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/values-w1240dp/dimens.xml'>dimens.xml</a></b></td>
													<td style='padding: 8px;'>- Dimens.xml in the values-w1240dp directory defines dimensional values for specific device configurations<br>- It sets the fab_margin dimension, which is crucial for maintaining consistent layout and design across devices with a width of 1240dp or more<br>- This contributes to the overall adaptability and responsiveness of the application's user interface.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- mipmap-anydpi-v26 Submodule -->
									<details>
										<summary><b>mipmap-anydpi-v26</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ app.src.main.res.mipmap-anydpi-v26</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/mipmap-anydpi-v26/ic_rym_round.xml'>ic_rym_round.xml</a></b></td>
													<td style='padding: 8px;'>- Defining the adaptive icon for the application, ic_rym_round.xml serves as a crucial component in the apps visual identity<br>- It specifies the foreground and background layers of the apps rounded icon, referencing other resources within the project<br>- This contributes to a cohesive and visually appealing user interface, enhancing the overall user experience.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/mipmap-anydpi-v26/ic_launcher.xml'>ic_launcher.xml</a></b></td>
													<td style='padding: 8px;'>- Defining the visual identity of the application, ic_launcher.xml configures the adaptive icon displayed on the users device<br>- It references separate drawable resources for the icons background, foreground, and monochrome versions, ensuring optimal display across various Android platforms and themes.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/mipmap-anydpi-v26/ic_launcher_round.xml'>ic_launcher_round.xml</a></b></td>
													<td style='padding: 8px;'>- Defining the visual identity of the application, ic_launcher_round.xml configures the adaptive icon displayed on user devices<br>- It references the background and foreground drawable resources, ensuring a consistent app icon across various Android platforms<br>- Additionally, it supports monochrome icons for specific use cases, enhancing the apps adaptability to diverse user interfaces.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/app/src/main/res/mipmap-anydpi-v26/ic_rym.xml'>ic_rym.xml</a></b></td>
													<td style='padding: 8px;'>- Defining the adaptive icon for the application, ic_rym.xml serves as a crucial element in the apps visual identity<br>- It specifies the background and foreground layers of the app icon, referencing the respective drawable resources<br>- This contributes to a cohesive and visually appealing user interface, enhancing the overall user experience.</td>
												</tr>
											</table>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<!-- gradle Submodule -->
	<details>
		<summary><b>gradle</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ gradle</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/gradle/libs.versions.toml'>libs.versions.toml</a></b></td>
					<td style='padding: 8px;'>- The gradle/libs.versions.toml file serves as a centralized location for managing dependencies and plugin versions in the project<br>- It defines the versions of Android SDK, JVM, Kotlin, and various libraries used throughout the codebase<br>- This approach ensures consistency and eases the process of updating or changing versions across the project.</td>
				</tr>
			</table>
		</blockquote>
	</details>
	<!-- common Submodule -->
	<details>
		<summary><b>common</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ common</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/build.gradle.kts'>build.gradle.kts</a></b></td>
					<td style='padding: 8px;'>- Common/build.gradle.kts configures the Android library and Kotlin Android plugins for the project<br>- It sets the namespace, compile SDK, minimum SDK, and JVM target versions<br>- Additionally, it establishes source and target compatibility with Java Version 11, ensuring the projects compatibility with specific Android and Java versions.</td>
				</tr>
			</table>
			<!-- di Submodule -->
			<details>
				<summary><b>di</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ common.di</b></code>
					<table style='width: 100%; border-collapse: collapse;'>
					<thead>
						<tr style='background-color: #f8f9fa;'>
							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
							<th style='text-align: left; padding: 8px;'>Summary</th>
						</tr>
					</thead>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/di/build.gradle.kts'>build.gradle.kts</a></b></td>
							<td style='padding: 8px;'>- Build.gradle.kts in common/di configures the Android library and Kotlin Android plugins for the Dependency Injection module<br>- It sets the Android SDK versions, Java compatibility, and JVM target<br>- This configuration ensures the modules compatibility with the overall projects tech stack and Android platform requirements.</td>
						</tr>
					</table>
					<!-- core Submodule -->
					<details>
						<summary><b>core</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ common.di.core</b></code>
							<table style='width: 100%; border-collapse: collapse;'>
							<thead>
								<tr style='background-color: #f8f9fa;'>
									<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
									<th style='text-align: left; padding: 8px;'>Summary</th>
								</tr>
							</thead>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/di/core/build.gradle.kts'>build.gradle.kts</a></b></td>
									<td style='padding: 8px;'>- Building on the core dependency injection module for the project, common/di/core/build.gradle.kts configures the Android and Kotlin settings, and defines dependencies for the domain, data, and common model modules<br>- It also integrates the common dependency injection provider and the Koin core library, ensuring seamless inter-module communication and dependency management.</td>
								</tr>
							</table>
							<!-- src Submodule -->
							<details>
								<summary><b>src</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ common.di.core.src</b></code>
									<!-- main Submodule -->
									<details>
										<summary><b>main</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ common.di.core.src.main</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/di/core/src/main/AndroidManifest.xml'>AndroidManifest.xml</a></b></td>
													<td style='padding: 8px;'>- Serving as a placeholder within the Android application structure, common/di/core/src/main/AndroidManifest.xml is an integral part of the projects Dependency Injection (DI) core<br>- It contributes to the overall app configuration, facilitating the management of application components and permissions, despite its current emptiness.</td>
												</tr>
											</table>
											<!-- java Submodule -->
											<details>
												<summary><b>java</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ common.di.core.src.main.java</b></code>
													<!-- com Submodule -->
													<details>
														<summary><b>com</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ common.di.core.src.main.java.com</b></code>
															<!-- jmp Submodule -->
															<details>
																<summary><b>jmp</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ common.di.core.src.main.java.com.jmp</b></code>
																	<!-- common Submodule -->
																	<details>
																		<summary><b>common</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ common.di.core.src.main.java.com.jmp.common</b></code>
																			<!-- di Submodule -->
																			<details>
																				<summary><b>di</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ common.di.core.src.main.java.com.jmp.common.di</b></code>
																					<!-- core Submodule -->
																					<details>
																						<summary><b>core</b></summary>
																						<blockquote>
																							<div class='directory-path' style='padding: 8px 0; color: #666;'>
																								<code><b>⦿ common.di.core.src.main.java.com.jmp.common.di.core</b></code>
																							<table style='width: 100%; border-collapse: collapse;'>
																							<thead>
																								<tr style='background-color: #f8f9fa;'>
																									<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																									<th style='text-align: left; padding: 8px;'>Summary</th>
																								</tr>
																							</thead>
																								<tr style='border-bottom: 1px solid #eee;'>
																									<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/di/core/src/main/java/com/jmp/common/di/core/CoreDependencies.kt'>CoreDependencies.kt</a></b></td>
																									<td style='padding: 8px;'>- CoreDependencies.kt serves as a central hub for managing dependencies within the project<br>- It consolidates modules from DomainDependencies and DataDependencies, providing a unified access point for all dependencies<br>- This structure enhances modularity and simplifies dependency management across the entire codebase.</td>
																								</tr>
																							</table>
																						</blockquote>
																					</details>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<!-- provider Submodule -->
					<details>
						<summary><b>provider</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ common.di.provider</b></code>
							<table style='width: 100%; border-collapse: collapse;'>
							<thead>
								<tr style='background-color: #f8f9fa;'>
									<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
									<th style='text-align: left; padding: 8px;'>Summary</th>
								</tr>
							</thead>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/di/provider/build.gradle.kts'>build.gradle.kts</a></b></td>
									<td style='padding: 8px;'>- Configuring the Android library and Kotlin Android plugins, the build.gradle.kts in common/di/provider sets the Android namespace, compile SDK, and minimum SDK versions<br>- It also specifies Java and JVM target versions, and includes the Koin core library as a dependency, ensuring the projects compatibility and functionality.</td>
								</tr>
							</table>
							<!-- src Submodule -->
							<details>
								<summary><b>src</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ common.di.provider.src</b></code>
									<!-- main Submodule -->
									<details>
										<summary><b>main</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ common.di.provider.src.main</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/di/provider/src/main/AndroidManifest.xml'>AndroidManifest.xml</a></b></td>
													<td style='padding: 8px;'>- AndroidManifest.xml, located in the common/di/provider/src/main directory, serves as a crucial component in the Android applications overall architecture<br>- It provides essential information about the application to the Android system, which the system must have before it can run any of the applications code.</td>
												</tr>
											</table>
											<!-- java Submodule -->
											<details>
												<summary><b>java</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ common.di.provider.src.main.java</b></code>
													<!-- com Submodule -->
													<details>
														<summary><b>com</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ common.di.provider.src.main.java.com</b></code>
															<!-- jmp Submodule -->
															<details>
																<summary><b>jmp</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ common.di.provider.src.main.java.com.jmp</b></code>
																	<!-- common Submodule -->
																	<details>
																		<summary><b>common</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ common.di.provider.src.main.java.com.jmp.common</b></code>
																			<!-- diprovider Submodule -->
																			<details>
																				<summary><b>diprovider</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ common.di.provider.src.main.java.com.jmp.common.diprovider</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/di/provider/src/main/java/com/jmp/common/diprovider/DependencyInjectorModules.kt'>DependencyInjectorModules.kt</a></b></td>
																							<td style='padding: 8px;'>- DependencyInjectorModules.kt serves as an interface in the common/di/provider directory, defining the structure for dependency injection modules within the project<br>- It specifies a list of modules, leveraging the Koin library, to manage dependencies across the entire codebase<br>- This ensures a streamlined, efficient approach to dependency management.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<!-- model Submodule -->
			<details>
				<summary><b>model</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ common.model</b></code>
					<table style='width: 100%; border-collapse: collapse;'>
					<thead>
						<tr style='background-color: #f8f9fa;'>
							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
							<th style='text-align: left; padding: 8px;'>Summary</th>
						</tr>
					</thead>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/model/build.gradle.kts'>build.gradle.kts</a></b></td>
							<td style='padding: 8px;'>- The build.gradle.kts in the common/model directory configures the build settings for the common model module of the project<br>- It specifies the Android and Kotlin plugins used, sets the Android SDK versions, enables multi-dex, and configures Java and Kotlin compile options<br>- It also defines the build types and JVM toolchain version.</td>
						</tr>
					</table>
					<!-- src Submodule -->
					<details>
						<summary><b>src</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ common.model.src</b></code>
							<!-- main Submodule -->
							<details>
								<summary><b>main</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ common.model.src.main</b></code>
									<table style='width: 100%; border-collapse: collapse;'>
									<thead>
										<tr style='background-color: #f8f9fa;'>
											<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
											<th style='text-align: left; padding: 8px;'>Summary</th>
										</tr>
									</thead>
										<tr style='border-bottom: 1px solid #eee;'>
											<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/model/src/main/AndroidManifest.xml'>AndroidManifest.xml</a></b></td>
											<td style='padding: 8px;'>- Acting as a unique identifier, the AndroidManifest.xml in the common/model module specifies the package name for the Android application<br>- Its a crucial component in the codebase architecture, providing essential information about the application to the Android system.</td>
										</tr>
									</table>
									<!-- java Submodule -->
									<details>
										<summary><b>java</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ common.model.src.main.java</b></code>
											<!-- com Submodule -->
											<details>
												<summary><b>com</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ common.model.src.main.java.com</b></code>
													<!-- jmp Submodule -->
													<details>
														<summary><b>jmp</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ common.model.src.main.java.com.jmp</b></code>
															<!-- common Submodule -->
															<details>
																<summary><b>common</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ common.model.src.main.java.com.jmp.common</b></code>
																	<!-- model Submodule -->
																	<details>
																		<summary><b>model</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ common.model.src.main.java.com.jmp.common.model</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/model/src/main/java/com/jmp/common/model/Character.kt'>Character.kt</a></b></td>
																					<td style='padding: 8px;'>- Character.kt serves as a data model in the common module of the project, defining the structure of a Character object with properties such as id, name, status, gender, species, image, origin, and location<br>- It implements Parcelable for efficient object serialization, facilitating data transfer between Android components.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/model/src/main/java/com/jmp/common/model/Location.kt'>Location.kt</a></b></td>
																					<td style='padding: 8px;'>- Name and url<br>- This class plays a crucial role in data handling and transfer across different components of the application.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/model/src/main/java/com/jmp/common/model/Status.kt'>Status.kt</a></b></td>
																					<td style='padding: 8px;'>- Status.kt, located in the common/model module, defines an enumeration representing the possible states of an entity within the application<br>- These states include ALIVE, DEAD, and UNKNOWN<br>- This enumeration is integral to the codebase, providing a standardized way to reference and manipulate entity statuses throughout the application.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/model/src/main/java/com/jmp/common/model/Origin.kt'>Origin.kt</a></b></td>
																					<td style='padding: 8px;'>- Name and url<br>- It plays a crucial role in data handling and transfer across different components of the Android application.</td>
																				</tr>
																			</table>
																			<!-- types Submodule -->
																			<details>
																				<summary><b>types</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ common.model.src.main.java.com.jmp.common.model.types</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/model/src/main/java/com/jmp/common/model/types/Failure.kt'>Failure.kt</a></b></td>
																							<td style='padding: 8px;'>- Failure.kt, located in the common model types of the JMP project, defines a sealed class to handle various types of failures<br>- It includes specific failure scenarios such as lack of internet connectivity, unknown errors, absence of characters to display, and issues loading a character<br>- This class aids in error management throughout the application.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/model/src/main/java/com/jmp/common/model/types/Either.kt'>Either.kt</a></b></td>
																							<td style='padding: 8px;'>- Either.kt provides a mechanism for handling success and error scenarios in a unified way across the codebase<br>- It encapsulates the result of an operation, which can either be a success (containing the result data) or an error (containing the failure reason)<br>- It also includes utility functions for performing actions based on the operations outcome.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- res Submodule -->
									<details>
										<summary><b>res</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ common.model.src.main.res</b></code>
											<!-- values Submodule -->
											<details>
												<summary><b>values</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ common.model.src.main.res.values</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/common/model/src/main/res/values/strings.xml'>strings.xml</a></b></td>
															<td style='padding: 8px;'>- Serving as a central repository for string resources, the strings.xml file in the model module primarily defines the applications name as model'<br>- This approach ensures consistency and ease of management for text elements across the entire codebase.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<!-- domain Submodule -->
	<details>
		<summary><b>domain</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ domain</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/domain/proguard-rules.pro'>proguard-rules.pro</a></b></td>
					<td style='padding: 8px;'>- ProGuard rules, located in the domain/proguard-rules.pro, govern the obfuscation, shrinking, and optimization of the Android application<br>- They control the configuration files applied in build.gradle.kts, preserve debugging stack traces, and manage the visibility of original source file names<br>- If the project uses a WebView with JavaScript, these rules also maintain the JavaScript interface.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/domain/build.gradle.kts'>build.gradle.kts</a></b></td>
					<td style='padding: 8px;'>- Domain/build.gradle.kts configures the Android library module, setting up the Android and Kotlin compile options, build types, and dependencies<br>- It also specifies the Android SDK versions, enables multiDex, and configures the JVM toolchain<br>- The file further defines dependencies on common modules and various libraries, ensuring seamless integration within the project.</td>
				</tr>
			</table>
			<!-- src Submodule -->
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ domain.src</b></code>
					<!-- main Submodule -->
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ domain.src.main</b></code>
							<table style='width: 100%; border-collapse: collapse;'>
							<thead>
								<tr style='background-color: #f8f9fa;'>
									<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
									<th style='text-align: left; padding: 8px;'>Summary</th>
								</tr>
							</thead>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/domain/src/main/AndroidManifest.xml'>AndroidManifest.xml</a></b></td>
									<td style='padding: 8px;'>- AndroidManifest.xml serves as the central manifest file in an Android project<br>- It provides essential information about the application to the Android system, which the system must have before it can run any of the applications code<br>- In this context, it declares the package name for the domain module of the application.</td>
								</tr>
							</table>
							<!-- java Submodule -->
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ domain.src.main.java</b></code>
									<!-- com Submodule -->
									<details>
										<summary><b>com</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ domain.src.main.java.com</b></code>
											<!-- jmp Submodule -->
											<details>
												<summary><b>jmp</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ domain.src.main.java.com.jmp</b></code>
													<!-- domain Submodule -->
													<details>
														<summary><b>domain</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ domain.src.main.java.com.jmp.domain</b></code>
															<!-- di Submodule -->
															<details>
																<summary><b>di</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ domain.src.main.java.com.jmp.domain.di</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/domain/src/main/java/com/jmp/domain/di/DomainDependencies.kt'>DomainDependencies.kt</a></b></td>
																			<td style='padding: 8px;'>- DomainDependencies.kt serves as a dependency injection module within the domain layer of the application<br>- It defines factories for creating instances of various interactors, such as FetchList, GetListState, and onboarding preference-related interactors<br>- These interactors handle specific use-cases, enabling a clean separation of concerns and promoting code reusability.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- characters Submodule -->
															<details>
																<summary><b>characters</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ domain.src.main.java.com.jmp.domain.characters</b></code>
																	<!-- repository Submodule -->
																	<details>
																		<summary><b>repository</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ domain.src.main.java.com.jmp.domain.characters.repository</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/domain/src/main/java/com/jmp/domain/characters/repository/CharactersRepository.kt'>CharactersRepository.kt</a></b></td>
																					<td style='padding: 8px;'>- CharactersRepository.kt, located in the domain layer of the codebase, outlines the contract for fetching and managing character data<br>- It defines methods for retrieving a list of characters, either from a remote source or local cache, and for observing changes in this list<br>- This interface plays a crucial role in the applications data management strategy.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- interactor Submodule -->
																	<details>
																		<summary><b>interactor</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ domain.src.main.java.com.jmp.domain.characters.interactor</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/domain/src/main/java/com/jmp/domain/characters/interactor/GetListState.kt'>GetListState.kt</a></b></td>
																					<td style='padding: 8px;'>- GetListState.kt, located in the domain layer, serves as an interactor for retrieving a state flow of character lists from the CharactersRepository<br>- It encapsulates the logic for fetching the current state of character data, providing a clean, decoupled way for other components to access this information.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/domain/src/main/java/com/jmp/domain/characters/interactor/FetchList.kt'>FetchList.kt</a></b></td>
																					<td style='padding: 8px;'>- FetchList, located in the domain layer of the codebase, serves as an interactor to retrieve a list of characters<br>- It leverages the CharactersRepository to fetch the list, either from a remote source or local storage, based on the provided parameters<br>- This operation is crucial for maintaining up-to-date character data within the application.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- preferences Submodule -->
															<details>
																<summary><b>preferences</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ domain.src.main.java.com.jmp.domain.preferences</b></code>
																	<!-- repository Submodule -->
																	<details>
																		<summary><b>repository</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ domain.src.main.java.com.jmp.domain.preferences.repository</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/domain/src/main/java/com/jmp/domain/preferences/repository/PreferencesRepository.kt'>PreferencesRepository.kt</a></b></td>
																					<td style='padding: 8px;'>- PreferencesRepository serves as an interface in the domain layer of the application, managing user preferences related to onboarding<br>- It provides methods to determine if onboarding should be displayed and to save this preference<br>- This component plays a crucial role in enhancing user experience by customizing the onboarding process.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- interactor Submodule -->
																	<details>
																		<summary><b>interactor</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ domain.src.main.java.com.jmp.domain.preferences.interactor</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/domain/src/main/java/com/jmp/domain/preferences/interactor/GetShouldShowOnboardingPreference.kt'>GetShouldShowOnboardingPreference.kt</a></b></td>
																					<td style='padding: 8px;'>- GetShouldShowOnboardingPreference.kt, located in the domain layer of the project, serves as an interactor for retrieving user onboarding preferences<br>- It communicates with the PreferencesRepository to determine if the onboarding process should be displayed<br>- This functionality is crucial for enhancing user experience by customizing the apps initial presentation based on individual user preferences.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/JavierManriqueCW/rick-and-morty-characters/blob/master/domain/src/main/java/com/jmp/domain/preferences/interactor/DisableShouldShowOnboardingPreference.kt'>DisableShouldShowOnboardingPreference.kt</a></b></td>
																					<td style='padding: 8px;'>- DisableShouldShowOnboardingPreference, located in the domain layer of the project, interacts with the PreferencesRepository to manage the onboarding display preference<br>- It primarily controls whether the onboarding process should be displayed to the user, enhancing the user experience by customizing the applications initial interaction.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---

## Getting Started

### Prerequisites

This project requires the following dependencies:

- **Programming Language:** Kotlin
- **Package Manager:** Gradle

### Installation

Build rick-and-morty-characters from the source and install dependencies:

**Clone the repository:**

    ```sh
    ❯ git clone https://github.com/JavierManriqueCW/rick-and-morty-characters
    ```

[![][back-to-top]](#top)

</div>


[back-to-top]: https://img.shields.io/badge/-BACK_TO_TOP-151515?style=flat-square


---
