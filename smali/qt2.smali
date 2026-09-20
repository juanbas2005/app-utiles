.class public final synthetic Lqt2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lqt2;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lqt2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqt2;->a:Lqt2;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.ktor.util.date.GMTDate"

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "seconds"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "minutes"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "hours"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "dayOfWeek"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "dayOfMonth"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "dayOfYear"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "month"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "year"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "timestamp"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    sput-object v1, Lqt2;->descriptor:Lll6;

    .line 64
    .line 65
    return-void
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


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 4

    .line 1
    invoke-static {}, Lio/ktor/util/date/GMTDate;->access$get$childSerializers$cp()[Lnz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    new-array v0, v0, [Lzr3;

    .line 8
    .line 9
    sget-object v1, Lue3;->a:Lue3;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aput-object v1, v0, v2

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    aput-object v1, v0, v2

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    aget-object v3, p0, v2

    .line 22
    .line 23
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    aput-object v3, v0, v2

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    aput-object v1, v0, v2

    .line 31
    .line 32
    const/4 v2, 0x5

    .line 33
    aput-object v1, v0, v2

    .line 34
    .line 35
    const/4 v2, 0x6

    .line 36
    aget-object p0, p0, v2

    .line 37
    .line 38
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    aput-object p0, v0, v2

    .line 43
    .line 44
    const/4 p0, 0x7

    .line 45
    aput-object v1, v0, p0

    .line 46
    .line 47
    const/16 p0, 0x8

    .line 48
    .line 49
    sget-object v1, Ltc4;->a:Ltc4;

    .line 50
    .line 51
    aput-object v1, v0, p0

    .line 52
    .line 53
    return-object v0
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

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 21

    .line 1
    sget-object v0, Lqt2;->descriptor:Lll6;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, Lok1;->c(Lll6;)Lgy0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Lio/ktor/util/date/GMTDate;->access$get$childSerializers$cp()[Lnz3;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const-wide/16 v6, 0x0

    .line 17
    .line 18
    move v9, v4

    .line 19
    move v10, v9

    .line 20
    move v11, v10

    .line 21
    move v12, v11

    .line 22
    move v14, v12

    .line 23
    move v15, v14

    .line 24
    move/from16 v17, v15

    .line 25
    .line 26
    move-object v13, v5

    .line 27
    move-wide/from16 v18, v6

    .line 28
    .line 29
    move v6, v3

    .line 30
    move-object v7, v13

    .line 31
    :goto_0
    if-eqz v6, :cond_0

    .line 32
    .line 33
    invoke-interface {v1, v0}, Lgy0;->h(Lll6;)I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    packed-switch v8, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    invoke-static {v8}, Lh;->e(I)V

    .line 41
    .line 42
    .line 43
    return-object v5

    .line 44
    :pswitch_0
    const/16 v8, 0x8

    .line 45
    .line 46
    invoke-interface {v1, v0, v8}, Lgy0;->D(Lll6;I)J

    .line 47
    .line 48
    .line 49
    move-result-wide v18

    .line 50
    or-int/lit16 v9, v9, 0x100

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_1
    const/4 v8, 0x7

    .line 54
    invoke-interface {v1, v0, v8}, Lgy0;->s(Lll6;I)I

    .line 55
    .line 56
    .line 57
    move-result v17

    .line 58
    or-int/lit16 v9, v9, 0x80

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_2
    const/4 v8, 0x6

    .line 62
    aget-object v16, v2, v8

    .line 63
    .line 64
    invoke-interface/range {v16 .. v16}, Lnz3;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v16

    .line 68
    move-object/from16 v5, v16

    .line 69
    .line 70
    check-cast v5, Lzr3;

    .line 71
    .line 72
    invoke-interface {v1, v0, v8, v5, v7}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    move-object v7, v5

    .line 77
    check-cast v7, Lxl4;

    .line 78
    .line 79
    or-int/lit8 v9, v9, 0x40

    .line 80
    .line 81
    :goto_1
    const/4 v5, 0x0

    .line 82
    goto :goto_0

    .line 83
    :pswitch_3
    const/4 v5, 0x5

    .line 84
    invoke-interface {v1, v0, v5}, Lgy0;->s(Lll6;I)I

    .line 85
    .line 86
    .line 87
    move-result v15

    .line 88
    or-int/lit8 v9, v9, 0x20

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_4
    const/4 v5, 0x4

    .line 92
    invoke-interface {v1, v0, v5}, Lgy0;->s(Lll6;I)I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    or-int/lit8 v9, v9, 0x10

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_5
    const/4 v5, 0x3

    .line 100
    aget-object v8, v2, v5

    .line 101
    .line 102
    invoke-interface {v8}, Lnz3;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, Lzr3;

    .line 107
    .line 108
    invoke-interface {v1, v0, v5, v8, v13}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    move-object v13, v5

    .line 113
    check-cast v13, Ls88;

    .line 114
    .line 115
    or-int/lit8 v9, v9, 0x8

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :pswitch_6
    const/4 v5, 0x2

    .line 119
    invoke-interface {v1, v0, v5}, Lgy0;->s(Lll6;I)I

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    or-int/lit8 v9, v9, 0x4

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :pswitch_7
    invoke-interface {v1, v0, v3}, Lgy0;->s(Lll6;I)I

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    or-int/lit8 v9, v9, 0x2

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :pswitch_8
    invoke-interface {v1, v0, v4}, Lgy0;->s(Lll6;I)I

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    or-int/lit8 v9, v9, 0x1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :pswitch_9
    move v6, v4

    .line 141
    goto :goto_0

    .line 142
    :cond_0
    invoke-interface {v1, v0}, Lgy0;->b(Lll6;)V

    .line 143
    .line 144
    .line 145
    new-instance v8, Lio/ktor/util/date/GMTDate;

    .line 146
    .line 147
    const/16 v20, 0x0

    .line 148
    .line 149
    move-object/from16 v16, v7

    .line 150
    .line 151
    invoke-direct/range {v8 .. v20}, Lio/ktor/util/date/GMTDate;-><init>(IIIILs88;IILxl4;IJLrl6;)V

    .line 152
    .line 153
    .line 154
    return-object v8

    .line 155
    :pswitch_data_0
    .packed-switch -0x1
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

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lqt2;->descriptor:Lll6;

    .line 2
    .line 3
    return-object p0
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

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/ktor/util/date/GMTDate;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqt2;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/ktor/util/date/GMTDate;->write$Self$ktor_utils(Lio/ktor/util/date/GMTDate;Lhy0;Lll6;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lhy0;->b(Lll6;)V

    .line 16
    .line 17
    .line 18
    return-void
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
