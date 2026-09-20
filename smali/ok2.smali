.class public final Lok2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final b:Lok2;

.field public static final c:Lok2;

.field public static final d:Lok2;


# instance fields
.field public final a:Leq4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lok2;

    .line 2
    .line 3
    invoke-direct {v0}, Lok2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lok2;->b:Lok2;

    .line 7
    .line 8
    new-instance v0, Lok2;

    .line 9
    .line 10
    invoke-direct {v0}, Lok2;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lok2;->c:Lok2;

    .line 14
    .line 15
    new-instance v0, Lok2;

    .line 16
    .line 17
    invoke-direct {v0}, Lok2;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lok2;->d:Lok2;

    .line 21
    .line 22
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Leq4;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Lqk2;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lok2;->a:Leq4;

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

.method public static a(Lok2;)Z
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lok2;->b:Lok2;

    .line 5
    .line 6
    const-string v1, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq p0, v0, :cond_10

    .line 10
    .line 11
    sget-object v0, Lok2;->c:Lok2;

    .line 12
    .line 13
    if-eq p0, v0, :cond_f

    .line 14
    .line 15
    iget-object p0, p0, Lok2;->a:Leq4;

    .line 16
    .line 17
    iget v0, p0, Leq4;->y:I

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const-string p0, "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 22
    .line 23
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return v2

    .line 29
    :cond_0
    iget-object p0, p0, Leq4;->w:[Ljava/lang/Object;

    .line 30
    .line 31
    move v1, v2

    .line 32
    move v3, v1

    .line 33
    :goto_0
    if-ge v1, v0, :cond_e

    .line 34
    .line 35
    aget-object v4, p0, v1

    .line 36
    .line 37
    check-cast v4, Lqk2;

    .line 38
    .line 39
    move-object v5, v4

    .line 40
    check-cast v5, Lll4;

    .line 41
    .line 42
    iget-object v5, v5, Lll4;->w:Lll4;

    .line 43
    .line 44
    iget-boolean v5, v5, Lll4;->J:Z

    .line 45
    .line 46
    if-nez v5, :cond_1

    .line 47
    .line 48
    const-string v5, "visitChildren called on an unattached node"

    .line 49
    .line 50
    invoke-static {v5}, Lyb3;->b(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    new-instance v5, Leq4;

    .line 54
    .line 55
    const/16 v6, 0x10

    .line 56
    .line 57
    new-array v7, v6, [Lll4;

    .line 58
    .line 59
    invoke-direct {v5, v7}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    check-cast v4, Lll4;

    .line 63
    .line 64
    iget-object v4, v4, Lll4;->w:Lll4;

    .line 65
    .line 66
    iget-object v7, v4, Lll4;->B:Lll4;

    .line 67
    .line 68
    if-nez v7, :cond_2

    .line 69
    .line 70
    invoke-static {v5, v4}, Lrc9;->h(Leq4;Lll4;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-virtual {v5, v7}, Leq4;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_1
    iget v4, v5, Leq4;->y:I

    .line 78
    .line 79
    if-eqz v4, :cond_d

    .line 80
    .line 81
    add-int/lit8 v4, v4, -0x1

    .line 82
    .line 83
    invoke-virtual {v5, v4}, Leq4;->l(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, Lll4;

    .line 88
    .line 89
    iget v7, v4, Lll4;->z:I

    .line 90
    .line 91
    and-int/lit16 v7, v7, 0x400

    .line 92
    .line 93
    if-nez v7, :cond_4

    .line 94
    .line 95
    invoke-static {v5, v4}, Lrc9;->h(Leq4;Lll4;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    :goto_2
    if-eqz v4, :cond_3

    .line 100
    .line 101
    iget v7, v4, Lll4;->y:I

    .line 102
    .line 103
    and-int/lit16 v7, v7, 0x400

    .line 104
    .line 105
    if-eqz v7, :cond_c

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    move-object v8, v7

    .line 109
    :goto_3
    if-eqz v4, :cond_3

    .line 110
    .line 111
    instance-of v9, v4, Lvk2;

    .line 112
    .line 113
    const/4 v10, 0x1

    .line 114
    if-eqz v9, :cond_5

    .line 115
    .line 116
    check-cast v4, Lvk2;

    .line 117
    .line 118
    const/4 v9, 0x7

    .line 119
    invoke-virtual {v4, v9}, Lvk2;->c1(I)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_b

    .line 124
    .line 125
    move v3, v10

    .line 126
    goto :goto_6

    .line 127
    :cond_5
    iget v9, v4, Lll4;->y:I

    .line 128
    .line 129
    and-int/lit16 v9, v9, 0x400

    .line 130
    .line 131
    if-eqz v9, :cond_b

    .line 132
    .line 133
    instance-of v9, v4, Lwo1;

    .line 134
    .line 135
    if-eqz v9, :cond_b

    .line 136
    .line 137
    move-object v9, v4

    .line 138
    check-cast v9, Lwo1;

    .line 139
    .line 140
    iget-object v9, v9, Lwo1;->L:Lll4;

    .line 141
    .line 142
    move v11, v2

    .line 143
    :goto_4
    if-eqz v9, :cond_a

    .line 144
    .line 145
    iget v12, v9, Lll4;->y:I

    .line 146
    .line 147
    and-int/lit16 v12, v12, 0x400

    .line 148
    .line 149
    if-eqz v12, :cond_9

    .line 150
    .line 151
    add-int/lit8 v11, v11, 0x1

    .line 152
    .line 153
    if-ne v11, v10, :cond_6

    .line 154
    .line 155
    move-object v4, v9

    .line 156
    goto :goto_5

    .line 157
    :cond_6
    if-nez v8, :cond_7

    .line 158
    .line 159
    new-instance v8, Leq4;

    .line 160
    .line 161
    new-array v12, v6, [Lll4;

    .line 162
    .line 163
    invoke-direct {v8, v12}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_7
    if-eqz v4, :cond_8

    .line 167
    .line 168
    invoke-virtual {v8, v4}, Leq4;->b(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    move-object v4, v7

    .line 172
    :cond_8
    invoke-virtual {v8, v9}, Leq4;->b(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_9
    :goto_5
    iget-object v9, v9, Lll4;->B:Lll4;

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_a
    if-ne v11, v10, :cond_b

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_b
    invoke-static {v8}, Lrc9;->j(Leq4;)Lll4;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    goto :goto_3

    .line 186
    :cond_c
    iget-object v4, v4, Lll4;->B:Lll4;

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_d
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_e
    return v3

    .line 194
    :cond_f
    invoke-static {v1}, Lh;->s(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return v2

    .line 198
    :cond_10
    invoke-static {v1}, Lh;->s(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return v2
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
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
