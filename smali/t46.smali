.class public final synthetic Lt46;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Laq4;


# direct methods
.method public synthetic constructor <init>(Laq4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt46;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lt46;->x:Laq4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lt46;->w:I

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Lvs7;->a:Lvs7;

    .line 7
    .line 8
    iget-object p0, p0, Lt46;->x:Laq4;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Ldy3;

    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, Ldy3;->w(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    new-instance p1, Ll35;

    .line 22
    .line 23
    invoke-direct {p1, v0, v1}, Ll35;-><init>(J)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, p1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :pswitch_0
    check-cast p1, Ldy3;

    .line 31
    .line 32
    invoke-interface {p0, p1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v3

    .line 36
    :pswitch_1
    check-cast p1, Ll35;

    .line 37
    .line 38
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Lvr2;

    .line 43
    .line 44
    invoke-interface {p0, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, p1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object v3

    .line 57
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const/16 v0, 0x12c

    .line 63
    .line 64
    invoke-static {v0, p1}, Ld57;->i1(ILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p0, p1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-object v3

    .line 72
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v1, p1}, Ld57;->i1(ILjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-interface {p0, p1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-object v3

    .line 85
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const/16 v0, 0xc8

    .line 91
    .line 92
    invoke-static {v0, p1}, Ld57;->i1(ILjava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {p0, p1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object v3

    .line 100
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v1, p1}, Ld57;->i1(ILjava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p0, p1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object v3

    .line 113
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    const/16 v1, 0x8

    .line 123
    .line 124
    if-gt v0, v1, :cond_0

    .line 125
    .line 126
    invoke-interface {p0, p1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_0
    return-object v3

    .line 130
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lsr2;

    .line 141
    .line 142
    invoke-interface {p0, v2}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    if-eqz p1, :cond_1

    .line 146
    .line 147
    if-eqz v0, :cond_1

    .line 148
    .line 149
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    :cond_1
    return-object v3

    .line 153
    :pswitch_9
    check-cast p1, Ljava/util/Map;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    check-cast p1, Ljava/lang/Iterable;

    .line 163
    .line 164
    instance-of v0, p1, Ljava/util/Collection;

    .line 165
    .line 166
    if-eqz v0, :cond_2

    .line 167
    .line 168
    move-object v0, p1

    .line 169
    check-cast v0, Ljava/util/Collection;

    .line 170
    .line 171
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_2

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_4

    .line 187
    .line 188
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Ljava/lang/Boolean;

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-nez v0, :cond_3

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_4
    :goto_0
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, Lsr2;

    .line 206
    .line 207
    if-eqz p1, :cond_5

    .line 208
    .line 209
    invoke-interface {p1}, Lsr2;->b()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    :cond_5
    :goto_1
    invoke-interface {p0, v2}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    return-object v3

    .line 216
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, Lsr2;

    .line 227
    .line 228
    invoke-interface {p0, v2}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    if-eqz p1, :cond_6

    .line 232
    .line 233
    if-eqz v0, :cond_6

    .line 234
    .line 235
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    :cond_6
    return-object v3

    .line 239
    :pswitch_b
    check-cast p1, Lq8;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget p1, p1, Lq8;->w:I

    .line 245
    .line 246
    const/4 v0, -0x1

    .line 247
    if-ne p1, v0, :cond_7

    .line 248
    .line 249
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    check-cast p1, Lsr2;

    .line 254
    .line 255
    if-eqz p1, :cond_7

    .line 256
    .line 257
    invoke-interface {p1}, Lsr2;->b()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    :cond_7
    invoke-interface {p0, v2}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    return-object v3

    .line 264
    :pswitch_c
    check-cast p1, Ljava/util/Map;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 270
    .line 271
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    :cond_8
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_9

    .line 287
    .line 288
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, Ljava/util/Map$Entry;

    .line 293
    .line 294
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    check-cast v4, Ljava/lang/String;

    .line 299
    .line 300
    const-string v5, "android.permission.READ_CONTACTS"

    .line 301
    .line 302
    invoke-static {v4, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-nez v4, :cond_8

    .line 307
    .line 308
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v0, v4, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    goto :goto_2

    .line 320
    :cond_9
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    check-cast p1, Ljava/lang/Iterable;

    .line 325
    .line 326
    instance-of v0, p1, Ljava/util/Collection;

    .line 327
    .line 328
    if-eqz v0, :cond_a

    .line 329
    .line 330
    move-object v0, p1

    .line 331
    check-cast v0, Ljava/util/Collection;

    .line 332
    .line 333
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-eqz v0, :cond_a

    .line 338
    .line 339
    goto :goto_3

    .line 340
    :cond_a
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-eqz v0, :cond_c

    .line 349
    .line 350
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    check-cast v0, Ljava/lang/Boolean;

    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    if-nez v0, :cond_b

    .line 361
    .line 362
    goto :goto_4

    .line 363
    :cond_c
    :goto_3
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    check-cast p1, Lsr2;

    .line 368
    .line 369
    if-eqz p1, :cond_d

    .line 370
    .line 371
    invoke-interface {p1}, Lsr2;->b()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    :cond_d
    :goto_4
    invoke-interface {p0, v2}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    return-object v3

    .line 378
    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    .line 379
    .line 380
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 381
    .line 382
    .line 383
    invoke-interface {p0, p1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    return-object v3

    .line 387
    :pswitch_e
    check-cast p1, Ljava/lang/Float;

    .line 388
    .line 389
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    check-cast p0, Lvr2;

    .line 397
    .line 398
    invoke-interface {p0, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    check-cast p0, Ljava/lang/Number;

    .line 403
    .line 404
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 405
    .line 406
    .line 407
    move-result p0

    .line 408
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    return-object p0

    .line 413
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 414
    .line 415
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    invoke-interface {p0, p1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    return-object v3

    .line 422
    nop

    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
