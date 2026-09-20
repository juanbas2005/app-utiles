.class public final Lon1;
.super Lin8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final x:Z

.field public y:Z

.field public z:Ljz0;


# direct methods
.method public constructor <init>(Lgz6;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lin8;-><init>(Lgz6;)V

    .line 5
    .line 6
    .line 7
    iput-boolean p2, p0, Lon1;->x:Z

    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final d1(Landroid/content/Context;)Ljz0;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lon1;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lon1;->z:Ljz0;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lgz6;

    .line 11
    .line 12
    iget-object v1, v0, Lgz6;->c:Lbq2;

    .line 13
    .line 14
    iget v0, v0, Lgz6;->a:I

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    move v0, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v0, v3

    .line 24
    :goto_0
    iget-object v2, v1, Lbq2;->f0:Laq2;

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    move v5, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    iget v5, v2, Laq2;->f:I

    .line 31
    .line 32
    :goto_1
    iget-boolean v6, p0, Lon1;->x:Z

    .line 33
    .line 34
    if-eqz v6, :cond_6

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    :goto_2
    move v2, v3

    .line 41
    goto :goto_3

    .line 42
    :cond_3
    iget v2, v2, Laq2;->d:I

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_4
    if-nez v2, :cond_5

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_5
    iget v2, v2, Laq2;->e:I

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_6
    if-eqz v0, :cond_8

    .line 52
    .line 53
    if-nez v2, :cond_7

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_7
    iget v2, v2, Laq2;->b:I

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_8
    if-nez v2, :cond_9

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_9
    iget v2, v2, Laq2;->c:I

    .line 63
    .line 64
    :goto_3
    invoke-virtual {v1, v3, v3, v3, v3}, Lbq2;->N(IIII)V

    .line 65
    .line 66
    .line 67
    iget-object v3, v1, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    if-eqz v3, :cond_a

    .line 71
    .line 72
    const v7, 0x7f09023b

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-eqz v3, :cond_a

    .line 80
    .line 81
    iget-object v3, v1, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 82
    .line 83
    invoke-virtual {v3, v7, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_a
    iget-object v1, v1, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 87
    .line 88
    if-eqz v1, :cond_b

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_b

    .line 95
    .line 96
    goto/16 :goto_7

    .line 97
    .line 98
    :cond_b
    if-nez v2, :cond_16

    .line 99
    .line 100
    if-eqz v5, :cond_16

    .line 101
    .line 102
    const/16 v1, 0x1001

    .line 103
    .line 104
    if-eq v5, v1, :cond_14

    .line 105
    .line 106
    const/16 v1, 0x2002

    .line 107
    .line 108
    if-eq v5, v1, :cond_12

    .line 109
    .line 110
    const/16 v1, 0x2005

    .line 111
    .line 112
    if-eq v5, v1, :cond_10

    .line 113
    .line 114
    const/16 v1, 0x1003

    .line 115
    .line 116
    if-eq v5, v1, :cond_e

    .line 117
    .line 118
    const/16 v1, 0x1004

    .line 119
    .line 120
    if-eq v5, v1, :cond_c

    .line 121
    .line 122
    const/4 v0, -0x1

    .line 123
    :goto_4
    move v2, v0

    .line 124
    goto :goto_5

    .line 125
    :cond_c
    if-eqz v0, :cond_d

    .line 126
    .line 127
    const v0, 0x10100b8

    .line 128
    .line 129
    .line 130
    invoke-static {p1, v0}, Lb96;->R(Landroid/content/Context;I)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    goto :goto_4

    .line 135
    :cond_d
    const v0, 0x10100b9

    .line 136
    .line 137
    .line 138
    invoke-static {p1, v0}, Lb96;->R(Landroid/content/Context;I)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    goto :goto_4

    .line 143
    :cond_e
    if-eqz v0, :cond_f

    .line 144
    .line 145
    const v0, 0x7f020007

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_f
    const v0, 0x7f020008

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_10
    if-eqz v0, :cond_11

    .line 154
    .line 155
    const v0, 0x10100ba

    .line 156
    .line 157
    .line 158
    invoke-static {p1, v0}, Lb96;->R(Landroid/content/Context;I)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    goto :goto_4

    .line 163
    :cond_11
    const v0, 0x10100bb

    .line 164
    .line 165
    .line 166
    invoke-static {p1, v0}, Lb96;->R(Landroid/content/Context;I)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    goto :goto_4

    .line 171
    :cond_12
    if-eqz v0, :cond_13

    .line 172
    .line 173
    const v0, 0x7f020005

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_13
    const v0, 0x7f020006

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_14
    if-eqz v0, :cond_15

    .line 182
    .line 183
    const v0, 0x7f020009

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_15
    const v0, 0x7f02000a

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_16
    :goto_5
    if-eqz v2, :cond_19

    .line 192
    .line 193
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const-string v1, "anim"

    .line 202
    .line 203
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    const/16 v1, 0x1a

    .line 208
    .line 209
    if-eqz v0, :cond_17

    .line 210
    .line 211
    :try_start_0
    invoke-static {p1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    if-eqz v3, :cond_19

    .line 216
    .line 217
    new-instance v5, Ljz0;

    .line 218
    .line 219
    invoke-direct {v5, v1, v3}, Ljz0;-><init>(ILjava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 220
    .line 221
    .line 222
    :goto_6
    move-object v6, v5

    .line 223
    goto :goto_7

    .line 224
    :catch_0
    move-exception p0

    .line 225
    throw p0

    .line 226
    :catch_1
    :cond_17
    :try_start_1
    invoke-static {p1, v2}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    if-eqz v3, :cond_19

    .line 231
    .line 232
    new-instance v5, Ljz0;

    .line 233
    .line 234
    invoke-direct {v5, v3}, Ljz0;-><init>(Landroid/animation/Animator;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 235
    .line 236
    .line 237
    goto :goto_6

    .line 238
    :catch_2
    move-exception v3

    .line 239
    if-nez v0, :cond_18

    .line 240
    .line 241
    invoke-static {p1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    if-eqz p1, :cond_19

    .line 246
    .line 247
    new-instance v6, Ljz0;

    .line 248
    .line 249
    invoke-direct {v6, v1, p1}, Ljz0;-><init>(ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_18
    throw v3

    .line 254
    :cond_19
    :goto_7
    iput-object v6, p0, Lon1;->z:Ljz0;

    .line 255
    .line 256
    iput-boolean v4, p0, Lon1;->y:Z

    .line 257
    .line 258
    return-object v6
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method
