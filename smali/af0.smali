.class public final Laf0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhf0;
.implements Lfg0;


# static fields
.field public static final synthetic f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic h:J

.field public static final synthetic i:J


# instance fields
.field volatile synthetic _closedCause:Ljava/lang/Object;

.field public final b:Ltc0;

.field public final c:Ljava/lang/Object;

.field public final d:Ltc0;

.field public final e:Ltc0;

.field private volatile flushBufferSize:I

.field volatile synthetic suspensionSlot:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-class v0, Laf0;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "suspensionSlot"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sput-object v3, Laf0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    sget-object v3, Ly79;->a:Lsun/misc/Unsafe;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v3, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    sput-wide v4, Laf0;->i:J

    .line 24
    .line 25
    const-string v2, "_closedCause"

    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sput-object v1, Laf0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v3, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    sput-wide v0, Laf0;->h:J

    .line 42
    .line 43
    return-void
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
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ltc0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Laf0;->b:Ltc0;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Laf0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    sget-object v0, Lqe0;->b:Lqe0;

    .line 19
    .line 20
    iput-object v0, p0, Laf0;->suspensionSlot:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance v0, Ltc0;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Laf0;->d:Ltc0;

    .line 28
    .line 29
    new-instance v0, Ltc0;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Laf0;->e:Ltc0;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 38
    .line 39
    return-void
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
.method public final a(Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    iget-object v0, p0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v6, Ljs0;

    .line 7
    .line 8
    invoke-direct {v6, p1}, Ljs0;-><init>(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Laf0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v1, Ly79;->a:Lsun/misc/Unsafe;

    .line 17
    .line 18
    sget-wide v3, Laf0;->h:J

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    move-object v2, p0

    .line 22
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    :goto_1
    sget-object p0, Lis0;->D:Lis0;

    .line 36
    .line 37
    invoke-virtual {v6, p0}, Ljs0;->a(Lvr2;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v2, p0}, Laf0;->k(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    move-object p0, v2

    .line 46
    goto :goto_0
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
.end method

.method public final b()Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object p0, p0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljs0;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lis0;->D:Lis0;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljs0;->a(Lvr2;)Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final c(Lh61;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v6, Lqe0;->b:Lqe0;

    .line 6
    .line 7
    sget-object v7, Lvs7;->a:Lvs7;

    .line 8
    .line 9
    instance-of v2, v1, Lwe0;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, Lwe0;

    .line 15
    .line 16
    iget v3, v2, Lwe0;->D:I

    .line 17
    .line 18
    const/high16 v4, -0x80000000

    .line 19
    .line 20
    and-int v5, v3, v4

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    iput v3, v2, Lwe0;->D:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v2, Lwe0;

    .line 29
    .line 30
    invoke-direct {v2, v0, v1}, Lwe0;-><init>(Laf0;Lh61;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v2, Lwe0;->B:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v8, Lp81;->w:Lp81;

    .line 36
    .line 37
    iget v3, v2, Lwe0;->D:I

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/high16 v10, 0x100000

    .line 41
    .line 42
    const/4 v11, 0x1

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    if-ne v3, v11, :cond_1

    .line 46
    .line 47
    iget v3, v2, Lwe0;->A:I

    .line 48
    .line 49
    iget-object v4, v2, Lwe0;->z:Laf0;

    .line 50
    .line 51
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object v12, v2

    .line 55
    move v13, v3

    .line 56
    move-object v15, v4

    .line 57
    move-object/from16 p1, v9

    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v9

    .line 67
    :cond_2
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Laf0;->b()Ljava/lang/Throwable;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-nez v1, :cond_11

    .line 75
    .line 76
    invoke-virtual {v0}, Laf0;->l()V

    .line 77
    .line 78
    .line 79
    iget v1, v0, Laf0;->flushBufferSize:I

    .line 80
    .line 81
    if-ge v1, v10, :cond_3

    .line 82
    .line 83
    goto/16 :goto_9

    .line 84
    .line 85
    :cond_3
    const/4 v1, 0x0

    .line 86
    move-object v15, v0

    .line 87
    move v13, v1

    .line 88
    move-object v12, v2

    .line 89
    :goto_1
    iget v1, v0, Laf0;->flushBufferSize:I

    .line 90
    .line 91
    if-lt v1, v10, :cond_10

    .line 92
    .line 93
    iget-object v1, v0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 94
    .line 95
    if-nez v1, :cond_10

    .line 96
    .line 97
    iput-object v15, v12, Lwe0;->z:Laf0;

    .line 98
    .line 99
    iput v13, v12, Lwe0;->A:I

    .line 100
    .line 101
    iput v11, v12, Lwe0;->D:I

    .line 102
    .line 103
    new-instance v1, Lkk0;

    .line 104
    .line 105
    invoke-static {v12}, Lrc9;->a0(Lf61;)Lf61;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-direct {v1, v11, v2}, Lkk0;-><init>(ILf61;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Lkk0;->v()V

    .line 113
    .line 114
    .line 115
    new-instance v2, Lte0;

    .line 116
    .line 117
    invoke-direct {v2, v1}, Lte0;-><init>(Lkk0;)V

    .line 118
    .line 119
    .line 120
    iget-object v3, v15, Laf0;->suspensionSlot:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, Lue0;

    .line 123
    .line 124
    instance-of v4, v3, Lpe0;

    .line 125
    .line 126
    if-nez v4, :cond_7

    .line 127
    .line 128
    sget-object v5, Laf0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 129
    .line 130
    :goto_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sget-object v14, Ly79;->a:Lsun/misc/Unsafe;

    .line 134
    .line 135
    sget-wide v16, Laf0;->i:J

    .line 136
    .line 137
    move-object/from16 v19, v2

    .line 138
    .line 139
    move-object/from16 v18, v3

    .line 140
    .line 141
    invoke-virtual/range {v14 .. v19}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    move-wide/from16 v20, v16

    .line 146
    .line 147
    move-object/from16 v17, v12

    .line 148
    .line 149
    move-wide/from16 v11, v20

    .line 150
    .line 151
    move-object/from16 p1, v9

    .line 152
    .line 153
    move-object v9, v14

    .line 154
    move-object/from16 v14, v18

    .line 155
    .line 156
    move-object/from16 v3, v19

    .line 157
    .line 158
    if-eqz v2, :cond_4

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_4
    invoke-virtual {v9, v15, v11, v12}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-eq v2, v14, :cond_6

    .line 166
    .line 167
    invoke-interface {v3}, Lse0;->b()V

    .line 168
    .line 169
    .line 170
    :cond_5
    :goto_3
    move-object v11, v1

    .line 171
    goto/16 :goto_7

    .line 172
    .line 173
    :cond_6
    move-object/from16 v9, p1

    .line 174
    .line 175
    move-object v2, v3

    .line 176
    move-object v3, v14

    .line 177
    move-object/from16 v12, v17

    .line 178
    .line 179
    const/4 v11, 0x1

    .line 180
    goto :goto_2

    .line 181
    :cond_7
    move-object v14, v3

    .line 182
    move-object/from16 p1, v9

    .line 183
    .line 184
    move-object/from16 v17, v12

    .line 185
    .line 186
    move-object v3, v2

    .line 187
    :goto_4
    instance-of v2, v14, Lte0;

    .line 188
    .line 189
    if-eqz v2, :cond_8

    .line 190
    .line 191
    move-object v3, v14

    .line 192
    check-cast v3, Lse0;

    .line 193
    .line 194
    new-instance v2, Lio/ktor/utils/io/ConcurrentIOException;

    .line 195
    .line 196
    const-string v4, "write"

    .line 197
    .line 198
    invoke-interface {v3}, Lse0;->c()Ljava/lang/Throwable;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-direct {v2, v4, v5}, Lio/ktor/utils/io/ConcurrentIOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v3, v2}, Lse0;->a(Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_8
    instance-of v2, v14, Lse0;

    .line 210
    .line 211
    if-eqz v2, :cond_9

    .line 212
    .line 213
    move-object v3, v14

    .line 214
    check-cast v3, Lse0;

    .line 215
    .line 216
    invoke-interface {v3}, Lse0;->b()V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_9
    if-eqz v4, :cond_a

    .line 221
    .line 222
    move-object v2, v14

    .line 223
    check-cast v2, Lpe0;

    .line 224
    .line 225
    iget-object v2, v2, Lpe0;->b:Ljava/lang/Throwable;

    .line 226
    .line 227
    invoke-interface {v3, v2}, Lse0;->a(Ljava/lang/Throwable;)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_a
    invoke-static {v14, v6}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-eqz v2, :cond_f

    .line 236
    .line 237
    :goto_5
    iget v2, v0, Laf0;->flushBufferSize:I

    .line 238
    .line 239
    if-lt v2, v10, :cond_b

    .line 240
    .line 241
    iget-object v2, v0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 242
    .line 243
    if-nez v2, :cond_b

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_b
    iget-object v2, v15, Laf0;->suspensionSlot:Ljava/lang/Object;

    .line 247
    .line 248
    move-object v5, v2

    .line 249
    check-cast v5, Lue0;

    .line 250
    .line 251
    instance-of v2, v5, Lte0;

    .line 252
    .line 253
    if-eqz v2, :cond_5

    .line 254
    .line 255
    sget-object v9, Laf0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 256
    .line 257
    :goto_6
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-object v2, v1

    .line 261
    sget-object v1, Ly79;->a:Lsun/misc/Unsafe;

    .line 262
    .line 263
    sget-wide v3, Laf0;->i:J

    .line 264
    .line 265
    move-object v11, v2

    .line 266
    move-object v2, v15

    .line 267
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v12

    .line 271
    if-eqz v12, :cond_c

    .line 272
    .line 273
    check-cast v5, Lse0;

    .line 274
    .line 275
    invoke-interface {v5}, Lse0;->b()V

    .line 276
    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_c
    invoke-virtual {v1, v15, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    if-eq v1, v5, :cond_d

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_d
    move-object v1, v11

    .line 287
    goto :goto_6

    .line 288
    :goto_7
    invoke-virtual {v11}, Lkk0;->t()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    if-ne v1, v8, :cond_e

    .line 293
    .line 294
    return-object v8

    .line 295
    :cond_e
    move-object/from16 v12, v17

    .line 296
    .line 297
    :goto_8
    move-object/from16 v9, p1

    .line 298
    .line 299
    const/4 v11, 0x1

    .line 300
    goto/16 :goto_1

    .line 301
    .line 302
    :cond_f
    invoke-static {}, Lh;->c()V

    .line 303
    .line 304
    .line 305
    return-object p1

    .line 306
    :cond_10
    :goto_9
    return-object v7

    .line 307
    :cond_11
    throw v1
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

.method public final d(ILh61;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    sget-object v6, Lqe0;->b:Lqe0;

    .line 6
    .line 7
    instance-of v2, v1, Lve0;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Lve0;

    .line 13
    .line 14
    iget v3, v2, Lve0;->E:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v2, Lve0;->E:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, Lve0;

    .line 27
    .line 28
    invoke-direct {v2, v0, v1}, Lve0;-><init>(Laf0;Lh61;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, v2, Lve0;->C:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v7, Lp81;->w:Lp81;

    .line 34
    .line 35
    iget v3, v2, Lve0;->E:I

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v10, 0x1

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    if-ne v3, v10, :cond_1

    .line 42
    .line 43
    iget v3, v2, Lve0;->A:I

    .line 44
    .line 45
    iget v4, v2, Lve0;->z:I

    .line 46
    .line 47
    iget-object v5, v2, Lve0;->B:Laf0;

    .line 48
    .line 49
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v12, v2

    .line 53
    move v13, v3

    .line 54
    move v11, v4

    .line 55
    move-object v15, v5

    .line 56
    move-object/from16 p2, v8

    .line 57
    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v8

    .line 66
    :cond_2
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Laf0;->b()Ljava/lang/Throwable;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-nez v1, :cond_13

    .line 74
    .line 75
    iget-object v1, v0, Laf0;->d:Ltc0;

    .line 76
    .line 77
    iget-wide v3, v1, Ltc0;->y:J

    .line 78
    .line 79
    move/from16 v1, p1

    .line 80
    .line 81
    int-to-long v11, v1

    .line 82
    cmp-long v3, v3, v11

    .line 83
    .line 84
    if-ltz v3, :cond_3

    .line 85
    .line 86
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_3
    move-object v15, v0

    .line 90
    move v11, v1

    .line 91
    move-object v12, v2

    .line 92
    const/4 v13, 0x0

    .line 93
    :goto_1
    iget v1, v0, Laf0;->flushBufferSize:I

    .line 94
    .line 95
    int-to-long v1, v1

    .line 96
    iget-object v3, v0, Laf0;->d:Ltc0;

    .line 97
    .line 98
    iget-wide v3, v3, Ltc0;->y:J

    .line 99
    .line 100
    add-long/2addr v1, v3

    .line 101
    int-to-long v3, v11

    .line 102
    cmp-long v1, v1, v3

    .line 103
    .line 104
    if-gez v1, :cond_10

    .line 105
    .line 106
    iget-object v1, v0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 107
    .line 108
    if-nez v1, :cond_10

    .line 109
    .line 110
    iput-object v15, v12, Lve0;->B:Laf0;

    .line 111
    .line 112
    iput v11, v12, Lve0;->z:I

    .line 113
    .line 114
    iput v13, v12, Lve0;->A:I

    .line 115
    .line 116
    iput v10, v12, Lve0;->E:I

    .line 117
    .line 118
    new-instance v1, Lkk0;

    .line 119
    .line 120
    invoke-static {v12}, Lrc9;->a0(Lf61;)Lf61;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-direct {v1, v10, v2}, Lkk0;-><init>(ILf61;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lkk0;->v()V

    .line 128
    .line 129
    .line 130
    new-instance v2, Lre0;

    .line 131
    .line 132
    invoke-direct {v2, v1}, Lre0;-><init>(Lkk0;)V

    .line 133
    .line 134
    .line 135
    iget-object v5, v15, Laf0;->suspensionSlot:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v5, Lue0;

    .line 138
    .line 139
    instance-of v14, v5, Lpe0;

    .line 140
    .line 141
    if-nez v14, :cond_7

    .line 142
    .line 143
    sget-object v20, Laf0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 144
    .line 145
    :goto_2
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move/from16 v16, v14

    .line 149
    .line 150
    sget-object v14, Ly79;->a:Lsun/misc/Unsafe;

    .line 151
    .line 152
    move/from16 v18, v16

    .line 153
    .line 154
    sget-wide v16, Laf0;->i:J

    .line 155
    .line 156
    move-object/from16 v19, v2

    .line 157
    .line 158
    move/from16 v2, v18

    .line 159
    .line 160
    move-object/from16 v18, v5

    .line 161
    .line 162
    invoke-virtual/range {v14 .. v19}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    move-object/from16 p2, v8

    .line 167
    .line 168
    move-object v9, v14

    .line 169
    move-object/from16 v8, v18

    .line 170
    .line 171
    move-object/from16 v14, v19

    .line 172
    .line 173
    move/from16 v18, v11

    .line 174
    .line 175
    move-wide/from16 v10, v16

    .line 176
    .line 177
    if-eqz v5, :cond_4

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_4
    invoke-virtual {v9, v15, v10, v11}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    if-eq v5, v8, :cond_6

    .line 185
    .line 186
    invoke-interface {v14}, Lse0;->b()V

    .line 187
    .line 188
    .line 189
    :cond_5
    :goto_3
    move-object v9, v1

    .line 190
    goto/16 :goto_7

    .line 191
    .line 192
    :cond_6
    move-object v5, v14

    .line 193
    move v14, v2

    .line 194
    move-object v2, v5

    .line 195
    move-object v5, v8

    .line 196
    move/from16 v11, v18

    .line 197
    .line 198
    const/4 v10, 0x1

    .line 199
    move-object/from16 v8, p2

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_7
    move/from16 p2, v14

    .line 203
    .line 204
    move-object v14, v2

    .line 205
    move/from16 v2, p2

    .line 206
    .line 207
    move-object/from16 p2, v8

    .line 208
    .line 209
    move/from16 v18, v11

    .line 210
    .line 211
    move-object v8, v5

    .line 212
    :goto_4
    nop

    .line 213
    instance-of v5, v8, Lre0;

    .line 214
    .line 215
    if-eqz v5, :cond_8

    .line 216
    .line 217
    move-object v5, v8

    .line 218
    check-cast v5, Lse0;

    .line 219
    .line 220
    new-instance v2, Lio/ktor/utils/io/ConcurrentIOException;

    .line 221
    .line 222
    const-string v8, "read"

    .line 223
    .line 224
    invoke-interface {v5}, Lse0;->c()Ljava/lang/Throwable;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    invoke-direct {v2, v8, v9}, Lio/ktor/utils/io/ConcurrentIOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v5, v2}, Lse0;->a(Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_8
    instance-of v5, v8, Lse0;

    .line 236
    .line 237
    if-eqz v5, :cond_9

    .line 238
    .line 239
    move-object v5, v8

    .line 240
    check-cast v5, Lse0;

    .line 241
    .line 242
    invoke-interface {v5}, Lse0;->b()V

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_9
    if-eqz v2, :cond_a

    .line 247
    .line 248
    move-object v5, v8

    .line 249
    check-cast v5, Lpe0;

    .line 250
    .line 251
    iget-object v2, v5, Lpe0;->b:Ljava/lang/Throwable;

    .line 252
    .line 253
    invoke-interface {v14, v2}, Lse0;->a(Ljava/lang/Throwable;)V

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_a
    invoke-static {v8, v6}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_f

    .line 262
    .line 263
    :goto_5
    iget v2, v0, Laf0;->flushBufferSize:I

    .line 264
    .line 265
    int-to-long v8, v2

    .line 266
    iget-object v2, v0, Laf0;->d:Ltc0;

    .line 267
    .line 268
    iget-wide v10, v2, Ltc0;->y:J

    .line 269
    .line 270
    add-long/2addr v8, v10

    .line 271
    cmp-long v2, v8, v3

    .line 272
    .line 273
    if-gez v2, :cond_b

    .line 274
    .line 275
    iget-object v2, v0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 276
    .line 277
    if-nez v2, :cond_b

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_b
    iget-object v2, v15, Laf0;->suspensionSlot:Ljava/lang/Object;

    .line 281
    .line 282
    move-object v5, v2

    .line 283
    check-cast v5, Lue0;

    .line 284
    .line 285
    instance-of v2, v5, Lre0;

    .line 286
    .line 287
    if-eqz v2, :cond_5

    .line 288
    .line 289
    sget-object v8, Laf0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 290
    .line 291
    :goto_6
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    move-object v2, v1

    .line 295
    sget-object v1, Ly79;->a:Lsun/misc/Unsafe;

    .line 296
    .line 297
    sget-wide v3, Laf0;->i:J

    .line 298
    .line 299
    move-object v9, v2

    .line 300
    move-object v2, v15

    .line 301
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    if-eqz v10, :cond_c

    .line 306
    .line 307
    check-cast v5, Lse0;

    .line 308
    .line 309
    invoke-interface {v5}, Lse0;->b()V

    .line 310
    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_c
    invoke-virtual {v1, v15, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    if-eq v1, v5, :cond_d

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_d
    move-object v1, v9

    .line 321
    goto :goto_6

    .line 322
    :goto_7
    invoke-virtual {v9}, Lkk0;->t()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    if-ne v1, v7, :cond_e

    .line 327
    .line 328
    return-object v7

    .line 329
    :cond_e
    move/from16 v11, v18

    .line 330
    .line 331
    :goto_8
    move-object/from16 v8, p2

    .line 332
    .line 333
    const/4 v10, 0x1

    .line 334
    goto/16 :goto_1

    .line 335
    .line 336
    :cond_f
    invoke-static {}, Lh;->c()V

    .line 337
    .line 338
    .line 339
    return-object p2

    .line 340
    :cond_10
    iget-object v1, v0, Laf0;->d:Ltc0;

    .line 341
    .line 342
    iget-wide v1, v1, Ltc0;->y:J

    .line 343
    .line 344
    const-wide/32 v5, 0x100000

    .line 345
    .line 346
    .line 347
    cmp-long v1, v1, v5

    .line 348
    .line 349
    if-gez v1, :cond_11

    .line 350
    .line 351
    invoke-virtual {v0}, Laf0;->m()V

    .line 352
    .line 353
    .line 354
    :cond_11
    iget-object v0, v0, Laf0;->d:Ltc0;

    .line 355
    .line 356
    iget-wide v0, v0, Ltc0;->y:J

    .line 357
    .line 358
    cmp-long v0, v0, v3

    .line 359
    .line 360
    if-ltz v0, :cond_12

    .line 361
    .line 362
    const/4 v9, 0x1

    .line 363
    goto :goto_9

    .line 364
    :cond_12
    const/4 v9, 0x0

    .line 365
    :goto_9
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    return-object v0

    .line 370
    :cond_13
    throw v1
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
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final e()Ltc0;
    .locals 1

    .line 1
    iget-object v0, p0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object p0, p0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljs0;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    sget-object v0, Lze0;->D:Lze0;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljs0;->a(Lvr2;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    throw p0

    .line 21
    :cond_1
    :goto_0
    new-instance p0, Lio/ktor/utils/io/ClosedWriteChannelException;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, v0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw p0

    .line 28
    :cond_2
    iget-object p0, p0, Laf0;->e:Ltc0;

    .line 29
    .line 30
    return-object p0
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

.method public final f(Lf61;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Lxe0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lxe0;

    .line 7
    .line 8
    iget v1, v0, Lxe0;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lxe0;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxe0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lxe0;-><init>(Laf0;Lf61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lxe0;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lxe0;->B:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :try_start_1
    iput v3, v0, Lxe0;->B:I

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Laf0;->c(Lh61;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    sget-object v0, Lp81;->w:Lp81;

    .line 55
    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    return-object v0

    .line 59
    :catchall_0
    :cond_3
    :goto_1
    sget-object v8, Lt49;->b:Ljs0;

    .line 60
    .line 61
    :goto_2
    sget-object p1, Laf0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object v3, Ly79;->a:Lsun/misc/Unsafe;

    .line 67
    .line 68
    sget-wide v5, Laf0;->h:J

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    move-object v4, p0

    .line 72
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    sget-object p1, Lvs7;->a:Lvs7;

    .line 77
    .line 78
    if-eqz p0, :cond_4

    .line 79
    .line 80
    invoke-virtual {v4, v2}, Laf0;->k(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_4
    invoke-virtual {v3, v4, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-eqz p0, :cond_5

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_5
    move-object p0, v4

    .line 92
    goto :goto_2
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

.method public final g()Ltc0;
    .locals 2

    .line 1
    iget-object v0, p0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljs0;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object v1, Lye0;->D:Lye0;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljs0;->a(Lvr2;)Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    throw v0

    .line 17
    :cond_1
    :goto_0
    iget-object v0, p0, Laf0;->d:Ltc0;

    .line 18
    .line 19
    invoke-virtual {v0}, Ltc0;->x()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Laf0;->m()V

    .line 26
    .line 27
    .line 28
    :cond_2
    iget-object p0, p0, Laf0;->d:Ltc0;

    .line 29
    .line 30
    return-object p0
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

.method public final h()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Laf0;->b()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Laf0;->_closedCause:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Laf0;->flushBufferSize:I

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Laf0;->d:Ltc0;

    .line 16
    .line 17
    invoke-virtual {p0}, Ltc0;->x()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0
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

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
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

.method public final j()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Laf0;->l()V

    .line 2
    .line 3
    .line 4
    sget-object v5, Lt49;->b:Ljs0;

    .line 5
    .line 6
    :goto_0
    sget-object v0, Laf0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v0, Ly79;->a:Lsun/misc/Unsafe;

    .line 12
    .line 13
    sget-wide v2, Laf0;->h:J

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    move-object v1, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    invoke-virtual {v1, p0}, Laf0;->k(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    move-object p0, v1

    .line 36
    goto :goto_0
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

.method public final k(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lpe0;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lpe0;-><init>(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, Lue0;->a:Lxb4;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v0, Lxb4;->O:Lpe0;

    .line 15
    .line 16
    :goto_0
    sget-object v1, Laf0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v1, Ly79;->a:Lsun/misc/Unsafe;

    .line 22
    .line 23
    sget-wide v2, Laf0;->i:J

    .line 24
    .line 25
    invoke-virtual {v1, p0, v2, v3, v0}, Lsun/misc/Unsafe;->getAndSetObject(Ljava/lang/Object;JLjava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lue0;

    .line 30
    .line 31
    instance-of v0, p0, Lse0;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    check-cast p0, Lse0;

    .line 36
    .line 37
    invoke-interface {p0, p1}, Lse0;->a(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
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
.end method

.method public final l()V
    .locals 7

    .line 1
    iget-object v0, p0, Laf0;->e:Ltc0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltc0;->x()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v1, p0, Laf0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    iget-object v0, p0, Laf0;->e:Ltc0;

    .line 14
    .line 15
    iget-wide v2, v0, Ltc0;->y:J

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    iget-object v3, p0, Laf0;->b:Ltc0;

    .line 19
    .line 20
    invoke-virtual {v3, v0}, Ltc0;->u(Lfw5;)J

    .line 21
    .line 22
    .line 23
    iget v0, p0, Laf0;->flushBufferSize:I

    .line 24
    .line 25
    add-int/2addr v0, v2

    .line 26
    iput v0, p0, Laf0;->flushBufferSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit v1

    .line 29
    iget-object v0, p0, Laf0;->suspensionSlot:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v5, v0

    .line 32
    check-cast v5, Lue0;

    .line 33
    .line 34
    instance-of v0, v5, Lre0;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    sget-object v0, Laf0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 39
    .line 40
    sget-object v6, Lqe0;->b:Lqe0;

    .line 41
    .line 42
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v1, Ly79;->a:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v3, Laf0;->i:J

    .line 48
    .line 49
    move-object v2, p0

    .line 50
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    check-cast v5, Lse0;

    .line 57
    .line 58
    invoke-interface {v5}, Lse0;->b()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eq p0, v5, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-object p0, v2

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    :goto_1
    return-void

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    move-object p0, v0

    .line 74
    monitor-exit v1

    .line 75
    throw p0
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final m()V
    .locals 7

    .line 1
    iget-object v1, p0, Laf0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Laf0;->b:Ltc0;

    .line 5
    .line 6
    iget-object v2, p0, Laf0;->d:Ltc0;

    .line 7
    .line 8
    invoke-virtual {v0, v2}, Ltc0;->v(Ltc0;)J

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Laf0;->flushBufferSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v1

    .line 15
    iget-object v0, p0, Laf0;->suspensionSlot:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v5, v0

    .line 18
    check-cast v5, Lue0;

    .line 19
    .line 20
    instance-of v0, v5, Lte0;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    sget-object v0, Laf0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 25
    .line 26
    sget-object v6, Lqe0;->b:Lqe0;

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v1, Ly79;->a:Lsun/misc/Unsafe;

    .line 32
    .line 33
    sget-wide v3, Laf0;->i:J

    .line 34
    .line 35
    move-object v2, p0

    .line 36
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    check-cast v5, Lse0;

    .line 43
    .line 44
    invoke-interface {v5}, Lse0;->b()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eq p0, v5, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object p0, v2

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    return-void

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    move-object p0, v0

    .line 60
    monitor-exit v1

    .line 61
    throw p0
    .line 62
    .line 63
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ByteChannel["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 p0, 0x5d

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
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
