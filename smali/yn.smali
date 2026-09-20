.class public abstract Lyn;
.super Leq2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lco;


# instance fields
.field public W:Lwo;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Leq2;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lrv0;->z:Lkg5;

    .line 5
    .line 6
    iget-object v0, v0, Lkg5;->y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkg5;

    .line 9
    .line 10
    new-instance v1, Lwn;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lwn;-><init>(Lyn;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "androidx:appcompat"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Lkg5;->K(Ljava/lang/String;Lgf6;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lxn;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p0, v1}, Lxn;-><init>(Lrv0;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lrv0;->m(Lb55;)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lrv0;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwo;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwo;->y()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lwo;->W:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v1, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lwo;->I:Lro;

    .line 28
    .line 29
    iget-object p0, p0, Lwo;->H:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, Lro;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lwo;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lwo;->k0:Z

    .line 9
    .line 10
    iget v2, v0, Lwo;->o0:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Lko;->x:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Lwo;->E(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Lko;->d(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, Lko;->n(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {p1}, Lwo;->q(Landroid/content/Context;)Lza4;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-static {p1, v0, v2, v5, v4}, Lwo;->v(Landroid/content/Context;ILza4;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :try_start_0
    move-object v6, p1

    .line 47
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 48
    .line 49
    invoke-virtual {v6, v3}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :catch_0
    :cond_2
    instance-of v3, p1, Ld61;

    .line 55
    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    invoke-static {p1, v0, v2, v5, v4}, Lwo;->v(Landroid/content/Context;ILza4;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    :try_start_1
    move-object v4, p1

    .line 63
    check-cast v4, Ld61;

    .line 64
    .line 65
    invoke-virtual {v4, v3}, Ld61;->a(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 66
    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :catch_1
    :cond_3
    sget-boolean v3, Lwo;->F0:Z

    .line 71
    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :cond_4
    new-instance v3, Landroid/content/res/Configuration;

    .line 77
    .line 78
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 79
    .line 80
    .line 81
    const/4 v4, -0x1

    .line 82
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 86
    .line 87
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 108
    .line 109
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 110
    .line 111
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-nez v7, :cond_1a

    .line 116
    .line 117
    new-instance v7, Landroid/content/res/Configuration;

    .line 118
    .line 119
    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    .line 120
    .line 121
    .line 122
    iput v4, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 123
    .line 124
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_5

    .line 129
    .line 130
    goto/16 :goto_1

    .line 131
    .line 132
    :cond_5
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 133
    .line 134
    iget v8, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 135
    .line 136
    cmpl-float v4, v4, v8

    .line 137
    .line 138
    if-eqz v4, :cond_6

    .line 139
    .line 140
    iput v8, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 141
    .line 142
    :cond_6
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    .line 143
    .line 144
    iget v8, v6, Landroid/content/res/Configuration;->mcc:I

    .line 145
    .line 146
    if-eq v4, v8, :cond_7

    .line 147
    .line 148
    iput v8, v7, Landroid/content/res/Configuration;->mcc:I

    .line 149
    .line 150
    :cond_7
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    .line 151
    .line 152
    iget v8, v6, Landroid/content/res/Configuration;->mnc:I

    .line 153
    .line 154
    if-eq v4, v8, :cond_8

    .line 155
    .line 156
    iput v8, v7, Landroid/content/res/Configuration;->mnc:I

    .line 157
    .line 158
    :cond_8
    invoke-static {v3, v6, v7}, Loo;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 159
    .line 160
    .line 161
    iget v4, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 162
    .line 163
    iget v8, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 164
    .line 165
    if-eq v4, v8, :cond_9

    .line 166
    .line 167
    iput v8, v7, Landroid/content/res/Configuration;->touchscreen:I

    .line 168
    .line 169
    :cond_9
    iget v4, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 170
    .line 171
    iget v8, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 172
    .line 173
    if-eq v4, v8, :cond_a

    .line 174
    .line 175
    iput v8, v7, Landroid/content/res/Configuration;->keyboard:I

    .line 176
    .line 177
    :cond_a
    iget v4, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 178
    .line 179
    iget v8, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 180
    .line 181
    if-eq v4, v8, :cond_b

    .line 182
    .line 183
    iput v8, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 184
    .line 185
    :cond_b
    iget v4, v3, Landroid/content/res/Configuration;->navigation:I

    .line 186
    .line 187
    iget v8, v6, Landroid/content/res/Configuration;->navigation:I

    .line 188
    .line 189
    if-eq v4, v8, :cond_c

    .line 190
    .line 191
    iput v8, v7, Landroid/content/res/Configuration;->navigation:I

    .line 192
    .line 193
    :cond_c
    iget v4, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 194
    .line 195
    iget v8, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 196
    .line 197
    if-eq v4, v8, :cond_d

    .line 198
    .line 199
    iput v8, v7, Landroid/content/res/Configuration;->navigationHidden:I

    .line 200
    .line 201
    :cond_d
    iget v4, v3, Landroid/content/res/Configuration;->orientation:I

    .line 202
    .line 203
    iget v8, v6, Landroid/content/res/Configuration;->orientation:I

    .line 204
    .line 205
    if-eq v4, v8, :cond_e

    .line 206
    .line 207
    iput v8, v7, Landroid/content/res/Configuration;->orientation:I

    .line 208
    .line 209
    :cond_e
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 210
    .line 211
    and-int/lit8 v4, v4, 0xf

    .line 212
    .line 213
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 214
    .line 215
    and-int/lit8 v8, v8, 0xf

    .line 216
    .line 217
    if-eq v4, v8, :cond_f

    .line 218
    .line 219
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 220
    .line 221
    or-int/2addr v4, v8

    .line 222
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 223
    .line 224
    :cond_f
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 225
    .line 226
    and-int/lit16 v4, v4, 0xc0

    .line 227
    .line 228
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 229
    .line 230
    and-int/lit16 v8, v8, 0xc0

    .line 231
    .line 232
    if-eq v4, v8, :cond_10

    .line 233
    .line 234
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 235
    .line 236
    or-int/2addr v4, v8

    .line 237
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 238
    .line 239
    :cond_10
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 240
    .line 241
    and-int/lit8 v4, v4, 0x30

    .line 242
    .line 243
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 244
    .line 245
    and-int/lit8 v8, v8, 0x30

    .line 246
    .line 247
    if-eq v4, v8, :cond_11

    .line 248
    .line 249
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 250
    .line 251
    or-int/2addr v4, v8

    .line 252
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 253
    .line 254
    :cond_11
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 255
    .line 256
    and-int/lit16 v4, v4, 0x300

    .line 257
    .line 258
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 259
    .line 260
    and-int/lit16 v8, v8, 0x300

    .line 261
    .line 262
    if-eq v4, v8, :cond_12

    .line 263
    .line 264
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 265
    .line 266
    or-int/2addr v4, v8

    .line 267
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 268
    .line 269
    :cond_12
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 270
    .line 271
    const/16 v8, 0x1a

    .line 272
    .line 273
    if-lt v4, v8, :cond_14

    .line 274
    .line 275
    invoke-static {v3}, Lr4;->a(Landroid/content/res/Configuration;)I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    and-int/lit8 v4, v4, 0x3

    .line 280
    .line 281
    invoke-static {v6}, Lr4;->a(Landroid/content/res/Configuration;)I

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    and-int/lit8 v8, v8, 0x3

    .line 286
    .line 287
    if-eq v4, v8, :cond_13

    .line 288
    .line 289
    invoke-static {v7}, Lr4;->a(Landroid/content/res/Configuration;)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-static {v6}, Lr4;->a(Landroid/content/res/Configuration;)I

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    and-int/lit8 v8, v8, 0x3

    .line 298
    .line 299
    or-int/2addr v4, v8

    .line 300
    invoke-static {v7, v4}, Lr4;->k(Landroid/content/res/Configuration;I)V

    .line 301
    .line 302
    .line 303
    :cond_13
    invoke-static {v3}, Lr4;->a(Landroid/content/res/Configuration;)I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    and-int/lit8 v4, v4, 0xc

    .line 308
    .line 309
    invoke-static {v6}, Lr4;->a(Landroid/content/res/Configuration;)I

    .line 310
    .line 311
    .line 312
    move-result v8

    .line 313
    and-int/lit8 v8, v8, 0xc

    .line 314
    .line 315
    if-eq v4, v8, :cond_14

    .line 316
    .line 317
    invoke-static {v7}, Lr4;->a(Landroid/content/res/Configuration;)I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    invoke-static {v6}, Lr4;->a(Landroid/content/res/Configuration;)I

    .line 322
    .line 323
    .line 324
    move-result v8

    .line 325
    and-int/lit8 v8, v8, 0xc

    .line 326
    .line 327
    or-int/2addr v4, v8

    .line 328
    invoke-static {v7, v4}, Lr4;->k(Landroid/content/res/Configuration;I)V

    .line 329
    .line 330
    .line 331
    :cond_14
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 332
    .line 333
    and-int/lit8 v4, v4, 0xf

    .line 334
    .line 335
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 336
    .line 337
    and-int/lit8 v8, v8, 0xf

    .line 338
    .line 339
    if-eq v4, v8, :cond_15

    .line 340
    .line 341
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 342
    .line 343
    or-int/2addr v4, v8

    .line 344
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 345
    .line 346
    :cond_15
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 347
    .line 348
    and-int/lit8 v4, v4, 0x30

    .line 349
    .line 350
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 351
    .line 352
    and-int/lit8 v8, v8, 0x30

    .line 353
    .line 354
    if-eq v4, v8, :cond_16

    .line 355
    .line 356
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 357
    .line 358
    or-int/2addr v4, v8

    .line 359
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 360
    .line 361
    :cond_16
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 362
    .line 363
    iget v8, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 364
    .line 365
    if-eq v4, v8, :cond_17

    .line 366
    .line 367
    iput v8, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 368
    .line 369
    :cond_17
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 370
    .line 371
    iget v8, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 372
    .line 373
    if-eq v4, v8, :cond_18

    .line 374
    .line 375
    iput v8, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 376
    .line 377
    :cond_18
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 378
    .line 379
    iget v8, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 380
    .line 381
    if-eq v4, v8, :cond_19

    .line 382
    .line 383
    iput v8, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 384
    .line 385
    :cond_19
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 386
    .line 387
    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 388
    .line 389
    if-eq v3, v4, :cond_1b

    .line 390
    .line 391
    iput v4, v7, Landroid/content/res/Configuration;->densityDpi:I

    .line 392
    .line 393
    goto :goto_1

    .line 394
    :cond_1a
    move-object v7, v5

    .line 395
    :cond_1b
    :goto_1
    invoke-static {p1, v0, v2, v7, v1}, Lwo;->v(Landroid/content/Context;ILza4;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    new-instance v2, Ld61;

    .line 400
    .line 401
    const v3, 0x7f120269

    .line 402
    .line 403
    .line 404
    invoke-direct {v2, p1, v3}, Ld61;-><init>(Landroid/content/Context;I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v0}, Ld61;->a(Landroid/content/res/Configuration;)V

    .line 408
    .line 409
    .line 410
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 411
    .line 412
    .line 413
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_5

    .line 414
    if-eqz p1, :cond_1f

    .line 415
    .line 416
    invoke-virtual {v2}, Ld61;->getTheme()Landroid/content/res/Resources$Theme;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 421
    .line 422
    const/16 v3, 0x1d

    .line 423
    .line 424
    if-lt v0, v3, :cond_1c

    .line 425
    .line 426
    invoke-static {p1}, Ldn;->k(Landroid/content/res/Resources$Theme;)V

    .line 427
    .line 428
    .line 429
    goto :goto_6

    .line 430
    :cond_1c
    sget-object v0, Ltf4;->g:Ljava/lang/Object;

    .line 431
    .line 432
    monitor-enter v0

    .line 433
    :try_start_3
    sget-boolean v3, Ltf4;->i:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 434
    .line 435
    if-nez v3, :cond_1d

    .line 436
    .line 437
    :try_start_4
    const-class v3, Landroid/content/res/Resources$Theme;

    .line 438
    .line 439
    const-string v4, "rebase"

    .line 440
    .line 441
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    sput-object v3, Ltf4;->h:Ljava/lang/reflect/Method;

    .line 446
    .line 447
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 448
    .line 449
    .line 450
    goto :goto_2

    .line 451
    :catchall_0
    move-exception p0

    .line 452
    goto :goto_5

    .line 453
    :catch_2
    move-exception v3

    .line 454
    :try_start_5
    const-string v4, "ResourcesCompat"

    .line 455
    .line 456
    const-string v6, "Failed to retrieve rebase() method"

    .line 457
    .line 458
    invoke-static {v4, v6, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 459
    .line 460
    .line 461
    :goto_2
    sput-boolean v1, Ltf4;->i:Z

    .line 462
    .line 463
    :cond_1d
    sget-object v1, Ltf4;->h:Ljava/lang/reflect/Method;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 464
    .line 465
    if-eqz v1, :cond_1e

    .line 466
    .line 467
    :try_start_6
    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 468
    .line 469
    .line 470
    goto :goto_4

    .line 471
    :catch_3
    move-exception p1

    .line 472
    goto :goto_3

    .line 473
    :catch_4
    move-exception p1

    .line 474
    :goto_3
    :try_start_7
    const-string v1, "ResourcesCompat"

    .line 475
    .line 476
    const-string v3, "Failed to invoke rebase() method via reflection"

    .line 477
    .line 478
    invoke-static {v1, v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 479
    .line 480
    .line 481
    sput-object v5, Ltf4;->h:Ljava/lang/reflect/Method;

    .line 482
    .line 483
    :cond_1e
    :goto_4
    monitor-exit v0

    .line 484
    goto :goto_6

    .line 485
    :goto_5
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 486
    throw p0

    .line 487
    :catch_5
    :cond_1f
    :goto_6
    move-object p1, v2

    .line 488
    :goto_7
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 489
    .line 490
    .line 491
    return-void
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
.end method

.method public final closeOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Lqv0;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwo;

    .line 6
    .line 7
    invoke-virtual {p0}, Lwo;->y()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lwo;->H:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwo;

    .line 6
    .line 7
    iget-object v0, p0, Lwo;->K:Lf87;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lwo;->C()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lf87;

    .line 15
    .line 16
    iget-object v1, p0, Lwo;->J:Lu98;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Lu98;->b()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Lwo;->G:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v0, v1}, Lf87;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lwo;->K:Lf87;

    .line 31
    .line 32
    :cond_1
    iget-object p0, p0, Lwo;->K:Lf87;

    .line 33
    .line 34
    return-object p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    sget v0, La38;->a:I

    .line 2
    .line 3
    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwo;

    .line 6
    .line 7
    iget-object v0, p0, Lwo;->J:Lu98;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lwo;->C()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lwo;->J:Lu98;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Lwo;->D(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lrv0;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwo;

    .line 9
    .line 10
    iget-boolean p1, p0, Lwo;->b0:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p0, Lwo;->V:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lwo;->C()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lwo;->J:Lu98;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object v0, p1, Lu98;->a:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/high16 v1, 0x7f050000

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1, v0}, Lu98;->d(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {}, Lyo;->a()Lyo;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, p0, Lwo;->G:Landroid/content/Context;

    .line 45
    .line 46
    monitor-enter p1

    .line 47
    :try_start_0
    iget-object v1, p1, Lyo;->a:Lt56;

    .line 48
    .line 49
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    :try_start_1
    iget-object v2, v1, Lt56;->b:Ljava/util/WeakHashMap;

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lvc4;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0}, Lvc4;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    monitor-exit p1

    .line 68
    new-instance p1, Landroid/content/res/Configuration;

    .line 69
    .line 70
    iget-object v0, p0, Lwo;->G:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {p1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lwo;->n0:Landroid/content/res/Configuration;

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    invoke-virtual {p0, p1, p1}, Lwo;->o(ZZ)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    :try_start_4
    throw p0

    .line 92
    :catchall_1
    move-exception p0

    .line 93
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 94
    throw p0
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final onContentChanged()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Leq2;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lko;->f()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Leq2;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const v1, 0x102002c

    .line 18
    .line 19
    .line 20
    if-ne p2, v1, :cond_5

    .line 21
    .line 22
    if-eqz p1, :cond_5

    .line 23
    .line 24
    iget-object p1, p1, Lu98;->e:Lsk1;

    .line 25
    .line 26
    check-cast p1, Lsj7;

    .line 27
    .line 28
    iget p1, p1, Lsj7;->b:I

    .line 29
    .line 30
    and-int/lit8 p1, p1, 0x4

    .line 31
    .line 32
    if-eqz p1, :cond_5

    .line 33
    .line 34
    invoke-static {p0}, Lb96;->A(Lyn;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_4

    .line 45
    .line 46
    new-instance p1, Ll07;

    .line 47
    .line 48
    invoke-direct {p1, p0}, Ll07;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Lb96;->A(Lyn;)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    if-nez p2, :cond_1

    .line 56
    .line 57
    invoke-static {p0}, Lb96;->A(Lyn;)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    :cond_1
    if-eqz p2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    iget-object v1, p1, Ll07;->y:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :cond_2
    invoke-virtual {p1, v1}, Ll07;->d(Landroid/content/ComponentName;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p1, Ll07;->x:Ljava/io/Serializable;

    .line 85
    .line 86
    check-cast v1, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-virtual {p1}, Ll07;->f()V

    .line 92
    .line 93
    .line 94
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 99
    .line 100
    .line 101
    :goto_0
    return v0

    .line 102
    :cond_4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    .line 103
    .line 104
    .line 105
    return v0

    .line 106
    :cond_5
    const/4 p0, 0x0

    .line 107
    return p0
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwo;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwo;->y()V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final onPostResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Leq2;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwo;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwo;->C()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lwo;->J:Lu98;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lu98;->u:Z

    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
.end method

.method public final onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Leq2;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwo;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v0, v1}, Lwo;->o(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Leq2;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwo;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwo;->C()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lwo;->J:Lu98;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lu98;->u:Z

    .line 19
    .line 20
    iget-object p0, p0, Lu98;->t:Ld68;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ld68;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lko;->m(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final openOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public final r()Lko;
    .locals 2

    .line 1
    iget-object v0, p0, Lyn;->W:Lwo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lko;->w:Lol6;

    .line 6
    .line 7
    new-instance v0, Lwo;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Lwo;-><init>(Landroid/content/Context;Landroid/view/Window;Lco;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lyn;->W:Lwo;

    .line 14
    .line 15
    :cond_0
    iget-object p0, p0, Lyn;->W:Lwo;

    .line 16
    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final s()Lu98;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwo;

    .line 6
    .line 7
    invoke-virtual {p0}, Lwo;->C()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lwo;->J:Lu98;

    .line 11
    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lrv0;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lko;->j(I)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Lrv0;->n()V

    .line 13
    invoke-virtual {p0}, Lyn;->r()Lko;

    move-result-object p0

    invoke-virtual {p0, p1}, Lko;->k(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 14
    invoke-virtual {p0}, Lrv0;->n()V

    .line 15
    invoke-virtual {p0}, Lyn;->r()Lko;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lko;->l(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyn;->r()Lko;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwo;

    .line 9
    .line 10
    iput p1, p0, Lwo;->p0:I

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
