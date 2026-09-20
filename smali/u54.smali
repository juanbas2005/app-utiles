.class public final synthetic Lu54;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lw54;

.field public final synthetic y:Lt54;


# direct methods
.method public synthetic constructor <init>(Lw54;Lt54;I)V
    .locals 0

    .line 1
    iput p3, p0, Lu54;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lu54;->x:Lw54;

    .line 4
    .line 5
    iput-object p2, p0, Lu54;->y:Lt54;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 64
    .line 65
    .line 66
    .line 67
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
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lu54;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object v4, p0, Lu54;->y:Lt54;

    .line 8
    .line 9
    iget-object p0, p0, Lu54;->x:Lw54;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    check-cast p1, Ljava/util/Map$Entry;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ls54;

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lv54;

    .line 31
    .line 32
    :goto_0
    iget-object v6, p1, Lv54;->a:Lk54;

    .line 33
    .line 34
    iget-object v7, p0, Lw54;->E:Lk54;

    .line 35
    .line 36
    iget-object v8, p0, Lw54;->D:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-gez v6, :cond_4

    .line 43
    .line 44
    iget-boolean v6, p0, Lw54;->C:Z

    .line 45
    .line 46
    if-nez v6, :cond_4

    .line 47
    .line 48
    iget-object v6, p0, Lw54;->y:Lwr0;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v6, v6, Lwr0;->x:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, Ltp4;

    .line 59
    .line 60
    invoke-virtual {v6, v0}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    iget-object v6, p1, Lv54;->a:Lk54;

    .line 67
    .line 68
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    sget-object v6, Lj54;->Companion:Lh54;

    .line 72
    .line 73
    iget-object v7, p1, Lv54;->a:Lk54;

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    const/4 v7, 0x1

    .line 86
    if-eq v6, v7, :cond_2

    .line 87
    .line 88
    if-eq v6, v3, :cond_1

    .line 89
    .line 90
    if-eq v6, v2, :cond_0

    .line 91
    .line 92
    move-object v6, v5

    .line 93
    goto :goto_1

    .line 94
    :cond_0
    sget-object v6, Lj54;->ON_RESUME:Lj54;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    sget-object v6, Lj54;->ON_START:Lj54;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    sget-object v6, Lj54;->ON_CREATE:Lj54;

    .line 101
    .line 102
    :goto_1
    if-eqz v6, :cond_3

    .line 103
    .line 104
    invoke-virtual {p1, v4, v6}, Lv54;->a(Lt54;Lj54;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v8}, Lit0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    iget-object p0, p1, Lv54;->a:Lk54;

    .line 112
    .line 113
    const-string p1, "no event up from "

    .line 114
    .line 115
    invoke-static {p1, p0}, Lku4;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-object v1, v5

    .line 119
    :cond_4
    return-object v1

    .line 120
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Ls54;

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Lv54;

    .line 134
    .line 135
    :goto_2
    iget-object v6, p1, Lv54;->a:Lk54;

    .line 136
    .line 137
    iget-object v7, p0, Lw54;->E:Lk54;

    .line 138
    .line 139
    iget-object v8, p0, Lw54;->D:Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-lez v6, :cond_9

    .line 146
    .line 147
    iget-boolean v6, p0, Lw54;->C:Z

    .line 148
    .line 149
    if-nez v6, :cond_9

    .line 150
    .line 151
    iget-object v6, p0, Lw54;->y:Lwr0;

    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v6, v6, Lwr0;->x:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v6, Ltp4;

    .line 162
    .line 163
    invoke-virtual {v6, v0}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_9

    .line 168
    .line 169
    sget-object v6, Lj54;->Companion:Lh54;

    .line 170
    .line 171
    iget-object v7, p1, Lv54;->a:Lk54;

    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    if-eq v6, v3, :cond_7

    .line 184
    .line 185
    if-eq v6, v2, :cond_6

    .line 186
    .line 187
    const/4 v7, 0x4

    .line 188
    if-eq v6, v7, :cond_5

    .line 189
    .line 190
    move-object v6, v5

    .line 191
    goto :goto_3

    .line 192
    :cond_5
    sget-object v6, Lj54;->ON_PAUSE:Lj54;

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_6
    sget-object v6, Lj54;->ON_STOP:Lj54;

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_7
    sget-object v6, Lj54;->ON_DESTROY:Lj54;

    .line 199
    .line 200
    :goto_3
    if-eqz v6, :cond_8

    .line 201
    .line 202
    invoke-virtual {v6}, Lj54;->a()Lk54;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, v4, v6}, Lv54;->a(Lt54;Lj54;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v8}, Lit0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_8
    iget-object p0, p1, Lv54;->a:Lk54;

    .line 217
    .line 218
    const-string p1, "no event down from "

    .line 219
    .line 220
    invoke-static {p1, p0}, Lku4;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    move-object v1, v5

    .line 224
    :cond_9
    return-object v1

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
