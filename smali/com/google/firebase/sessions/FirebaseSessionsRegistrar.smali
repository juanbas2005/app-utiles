.class public final Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J=\u0010\u0008\u001a0\u0012,\u0012*\u0012\u000e\u0008\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;",
        "Lcom/google/firebase/components/ComponentRegistrar;",
        "<init>",
        "()V",
        "",
        "Lgv0;",
        "",
        "kotlin.jvm.PlatformType",
        "getComponents",
        "()Ljava/util/List;",
        "Companion",
        "ag2",
        "com.google.firebase-firebase-sessions"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lag2;

.field public static final LIBRARY_NAME:Ljava/lang/String; = "fire-sessions"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final appContext:Lav5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav5;"
        }
    .end annotation
.end field

.field private static final backgroundDispatcher:Lav5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav5;"
        }
    .end annotation
.end field

.field private static final blockingDispatcher:Lav5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav5;"
        }
    .end annotation
.end field

.field private static final firebaseApp:Lav5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav5;"
        }
    .end annotation
.end field

.field private static final firebaseInstallationsApi:Lav5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav5;"
        }
    .end annotation
.end field

.field private static final firebaseSessionsComponent:Lav5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav5;"
        }
    .end annotation
.end field

.field private static final transportFactory:Lav5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav5;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lag2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->Companion:Lag2;

    .line 7
    .line 8
    const-class v0, Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v0}, Lav5;->a(Ljava/lang/Class;)Lav5;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->appContext:Lav5;

    .line 15
    .line 16
    const-class v0, Loe2;

    .line 17
    .line 18
    invoke-static {v0}, Lav5;->a(Ljava/lang/Class;)Lav5;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lav5;

    .line 23
    .line 24
    const-class v0, Lwe2;

    .line 25
    .line 26
    invoke-static {v0}, Lav5;->a(Ljava/lang/Class;)Lav5;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lav5;

    .line 31
    .line 32
    new-instance v0, Lav5;

    .line 33
    .line 34
    const-class v1, Lt30;

    .line 35
    .line 36
    const-class v2, Lh81;

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lav5;

    .line 42
    .line 43
    new-instance v0, Lav5;

    .line 44
    .line 45
    const-class v1, Lx90;

    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Lav5;

    .line 51
    .line 52
    const-class v0, Lcn7;

    .line 53
    .line 54
    invoke-static {v0}, Lav5;->a(Ljava/lang/Class;)Lav5;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Lav5;

    .line 59
    .line 60
    const-class v0, Ltf2;

    .line 61
    .line 62
    invoke-static {v0}, Lav5;->a(Ljava/lang/Class;)Lav5;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseSessionsComponent:Lav5;

    .line 67
    .line 68
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static synthetic a(Lkd6;)Ltf2;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$1(Ltv0;)Ltf2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static final synthetic access$getAppContext$cp()Lav5;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->appContext:Lav5;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getBackgroundDispatcher$cp()Lav5;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lav5;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getBlockingDispatcher$cp()Lav5;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Lav5;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getFirebaseApp$cp()Lav5;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lav5;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getFirebaseInstallationsApi$cp()Lav5;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lav5;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getFirebaseSessionsComponent$cp()Lav5;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseSessionsComponent:Lav5;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getTransportFactory$cp()Lav5;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Lav5;

    .line 2
    .line 3
    return-object v0
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

.method public static synthetic b(Lkd6;)Lsf2;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$0(Ltv0;)Lsf2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method private static final getComponents$lambda$0(Ltv0;)Lsf2;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseSessionsComponent:Lav5;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ltv0;->s(Lav5;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ltf2;

    .line 8
    .line 9
    check-cast p0, Lyd1;

    .line 10
    .line 11
    iget-object p0, p0, Lyd1;->p:Lku5;

    .line 12
    .line 13
    invoke-interface {p0}, Lmu5;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lsf2;

    .line 18
    .line 19
    return-object p0
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

.method private static final getComponents$lambda$1(Ltv0;)Ltf2;
    .locals 14

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->appContext:Lav5;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ltv0;->s(Lav5;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Landroid/content/Context;

    .line 11
    .line 12
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lav5;

    .line 13
    .line 14
    invoke-interface {p0, v1}, Ltv0;->s(Lav5;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v1, Le81;

    .line 22
    .line 23
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Lav5;

    .line 24
    .line 25
    invoke-interface {p0, v2}, Ltv0;->s(Lav5;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast v2, Le81;

    .line 33
    .line 34
    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lav5;

    .line 35
    .line 36
    invoke-interface {p0, v3}, Ltv0;->s(Lav5;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v3, Loe2;

    .line 44
    .line 45
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lav5;

    .line 46
    .line 47
    invoke-interface {p0, v4}, Ltv0;->s(Lav5;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    check-cast v4, Lwe2;

    .line 55
    .line 56
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Lav5;

    .line 57
    .line 58
    invoke-interface {p0, v5}, Ltv0;->r(Lav5;)Lnu5;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v5, Lyd1;

    .line 66
    .line 67
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-static {v3}, Lom6;->a(Ljava/lang/Object;)Lom6;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iput-object v3, v5, Lyd1;->a:Lom6;

    .line 75
    .line 76
    invoke-static {v0}, Lom6;->a(Ljava/lang/Object;)Lom6;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, v5, Lyd1;->b:Lom6;

    .line 81
    .line 82
    new-instance v3, Ld72;

    .line 83
    .line 84
    const/4 v6, 0x2

    .line 85
    invoke-direct {v3, v0, v6}, Ld72;-><init>(Lom6;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, Lbx1;->a(Lcb2;)Lku5;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, v5, Lyd1;->c:Lku5;

    .line 93
    .line 94
    sget-object v0, Lrd3;->i:Lwf2;

    .line 95
    .line 96
    invoke-static {v0}, Lbx1;->a(Lcb2;)Lku5;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, v5, Lyd1;->d:Lku5;

    .line 101
    .line 102
    invoke-static {v4}, Lom6;->a(Ljava/lang/Object;)Lom6;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, v5, Lyd1;->e:Lom6;

    .line 107
    .line 108
    iget-object v0, v5, Lyd1;->a:Lom6;

    .line 109
    .line 110
    new-instance v3, Ld72;

    .line 111
    .line 112
    const/4 v4, 0x1

    .line 113
    invoke-direct {v3, v0, v4}, Ld72;-><init>(Lom6;I)V

    .line 114
    .line 115
    .line 116
    invoke-static {v3}, Lbx1;->a(Lcb2;)Lku5;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iput-object v0, v5, Lyd1;->f:Lku5;

    .line 121
    .line 122
    invoke-static {v2}, Lom6;->a(Ljava/lang/Object;)Lom6;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, v5, Lyd1;->g:Lom6;

    .line 127
    .line 128
    iget-object v2, v5, Lyd1;->f:Lku5;

    .line 129
    .line 130
    new-instance v3, Luf2;

    .line 131
    .line 132
    invoke-direct {v3, v2, v0}, Luf2;-><init>(Lku5;Lom6;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v3}, Lbx1;->a(Lcb2;)Lku5;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, v5, Lyd1;->h:Lku5;

    .line 140
    .line 141
    invoke-static {v1}, Lom6;->a(Ljava/lang/Object;)Lom6;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iput-object v0, v5, Lyd1;->i:Lom6;

    .line 146
    .line 147
    iget-object v0, v5, Lyd1;->b:Lom6;

    .line 148
    .line 149
    iget-object v1, v5, Lyd1;->g:Lom6;

    .line 150
    .line 151
    new-instance v2, Luf2;

    .line 152
    .line 153
    const/4 v3, 0x0

    .line 154
    invoke-direct {v2, v0, v1, v3}, Luf2;-><init>(Lom6;Lku5;I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v2}, Lbx1;->a(Lcb2;)Lku5;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v1, v5, Lyd1;->i:Lom6;

    .line 162
    .line 163
    iget-object v2, v5, Lyd1;->d:Lku5;

    .line 164
    .line 165
    new-instance v6, Lvf2;

    .line 166
    .line 167
    invoke-direct {v6, v1, v2, v0}, Lvf2;-><init>(Lku5;Lku5;Lku5;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v6}, Lbx1;->a(Lcb2;)Lku5;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    iget-object v8, v5, Lyd1;->d:Lku5;

    .line 175
    .line 176
    iget-object v9, v5, Lyd1;->e:Lom6;

    .line 177
    .line 178
    iget-object v10, v5, Lyd1;->f:Lku5;

    .line 179
    .line 180
    iget-object v11, v5, Lyd1;->h:Lku5;

    .line 181
    .line 182
    new-instance v7, Lh46;

    .line 183
    .line 184
    invoke-direct/range {v7 .. v12}, Lh46;-><init>(Lku5;Lku5;Lku5;Lku5;Lku5;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v7}, Lbx1;->a(Lcb2;)Lku5;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    iget-object v1, v5, Lyd1;->c:Lku5;

    .line 192
    .line 193
    new-instance v2, Lxm6;

    .line 194
    .line 195
    invoke-direct {v2, v1, v0, v4}, Lxm6;-><init>(Lku5;Lku5;I)V

    .line 196
    .line 197
    .line 198
    invoke-static {v2}, Lbx1;->a(Lcb2;)Lku5;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    iput-object v0, v5, Lyd1;->j:Lku5;

    .line 203
    .line 204
    sget-object v0, Lrg3;->f:Lwf2;

    .line 205
    .line 206
    invoke-static {v0}, Lbx1;->a(Lcb2;)Lku5;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iput-object v0, v5, Lyd1;->k:Lku5;

    .line 211
    .line 212
    iget-object v1, v5, Lyd1;->d:Lku5;

    .line 213
    .line 214
    new-instance v2, Lxm6;

    .line 215
    .line 216
    invoke-direct {v2, v1, v0, v3}, Lxm6;-><init>(Lku5;Lku5;I)V

    .line 217
    .line 218
    .line 219
    invoke-static {v2}, Lbx1;->a(Lcb2;)Lku5;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iput-object v0, v5, Lyd1;->l:Lku5;

    .line 224
    .line 225
    invoke-static {p0}, Lom6;->a(Ljava/lang/Object;)Lom6;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    new-instance v0, Ld72;

    .line 230
    .line 231
    invoke-direct {v0, p0, v3}, Ld72;-><init>(Lom6;I)V

    .line 232
    .line 233
    .line 234
    invoke-static {v0}, Lbx1;->a(Lcb2;)Lku5;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    iget-object v7, v5, Lyd1;->a:Lom6;

    .line 239
    .line 240
    iget-object v8, v5, Lyd1;->e:Lom6;

    .line 241
    .line 242
    iget-object v9, v5, Lyd1;->j:Lku5;

    .line 243
    .line 244
    iget-object v11, v5, Lyd1;->i:Lom6;

    .line 245
    .line 246
    new-instance v6, Lh46;

    .line 247
    .line 248
    invoke-direct/range {v6 .. v11}, Lh46;-><init>(Lom6;Lku5;Lku5;Lku5;Lku5;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v6}, Lbx1;->a(Lcb2;)Lku5;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    iput-object p0, v5, Lyd1;->m:Lku5;

    .line 256
    .line 257
    iget-object p0, v5, Lyd1;->l:Lku5;

    .line 258
    .line 259
    new-instance v0, Lom6;

    .line 260
    .line 261
    invoke-direct {v0, v3, p0}, Lom6;-><init>(ILjava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v0}, Lbx1;->a(Lcb2;)Lku5;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    iget-object v0, v5, Lyd1;->b:Lom6;

    .line 269
    .line 270
    iget-object v1, v5, Lyd1;->g:Lom6;

    .line 271
    .line 272
    new-instance v2, Lvf2;

    .line 273
    .line 274
    invoke-direct {v2, v0, v1, p0}, Lvf2;-><init>(Lom6;Lku5;Lku5;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v2}, Lbx1;->a(Lcb2;)Lku5;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    iput-object p0, v5, Lyd1;->n:Lku5;

    .line 282
    .line 283
    iget-object p0, v5, Lyd1;->b:Lom6;

    .line 284
    .line 285
    iget-object v0, v5, Lyd1;->k:Lku5;

    .line 286
    .line 287
    new-instance v1, Luf2;

    .line 288
    .line 289
    invoke-direct {v1, p0, v0, v4}, Luf2;-><init>(Lom6;Lku5;I)V

    .line 290
    .line 291
    .line 292
    invoke-static {v1}, Lbx1;->a(Lcb2;)Lku5;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    iget-object v7, v5, Lyd1;->j:Lku5;

    .line 297
    .line 298
    iget-object v8, v5, Lyd1;->l:Lku5;

    .line 299
    .line 300
    iget-object v9, v5, Lyd1;->m:Lku5;

    .line 301
    .line 302
    iget-object v10, v5, Lyd1;->d:Lku5;

    .line 303
    .line 304
    iget-object v11, v5, Lyd1;->n:Lku5;

    .line 305
    .line 306
    iget-object v13, v5, Lyd1;->i:Lom6;

    .line 307
    .line 308
    new-instance v6, Lfs6;

    .line 309
    .line 310
    invoke-direct/range {v6 .. v13}, Lfs6;-><init>(Lku5;Lku5;Lku5;Lku5;Lku5;Lku5;Lku5;)V

    .line 311
    .line 312
    .line 313
    invoke-static {v6}, Lbx1;->a(Lcb2;)Lku5;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    iput-object p0, v5, Lyd1;->o:Lku5;

    .line 318
    .line 319
    new-instance v0, Lom6;

    .line 320
    .line 321
    invoke-direct {v0, v4, p0}, Lom6;-><init>(ILjava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-static {v0}, Lbx1;->a(Lcb2;)Lku5;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    iget-object v0, v5, Lyd1;->a:Lom6;

    .line 329
    .line 330
    iget-object v1, v5, Lyd1;->j:Lku5;

    .line 331
    .line 332
    iget-object v2, v5, Lyd1;->i:Lom6;

    .line 333
    .line 334
    new-instance v3, Lbg2;

    .line 335
    .line 336
    invoke-direct {v3, v0, v1, v2, p0}, Lbg2;-><init>(Lom6;Lku5;Lku5;Lku5;)V

    .line 337
    .line 338
    .line 339
    invoke-static {v3}, Lbx1;->a(Lcb2;)Lku5;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    iput-object p0, v5, Lyd1;->p:Lku5;

    .line 344
    .line 345
    return-object v5
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


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgv0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, Lsf2;

    .line 2
    .line 3
    invoke-static {p0}, Lgv0;->b(Ljava/lang/Class;)Lfv0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "fire-sessions"

    .line 8
    .line 9
    iput-object v0, p0, Lfv0;->a:Ljava/lang/String;

    .line 10
    .line 11
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseSessionsComponent:Lav5;

    .line 12
    .line 13
    invoke-static {v1}, Lzp1;->b(Lav5;)Lzp1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, v1}, Lfv0;->a(Lzp1;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lrf2;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, v2}, Lrf2;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lfv0;->g:Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-virtual {p0, v1}, Lfv0;->c(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lfv0;->b()Lgv0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-class v3, Ltf2;

    .line 37
    .line 38
    invoke-static {v3}, Lgv0;->b(Ljava/lang/Class;)Lfv0;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const-string v4, "fire-sessions-component"

    .line 43
    .line 44
    iput-object v4, v3, Lfv0;->a:Ljava/lang/String;

    .line 45
    .line 46
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->appContext:Lav5;

    .line 47
    .line 48
    invoke-static {v4}, Lzp1;->b(Lav5;)Lzp1;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v3, v4}, Lfv0;->a(Lzp1;)V

    .line 53
    .line 54
    .line 55
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lav5;

    .line 56
    .line 57
    invoke-static {v4}, Lzp1;->b(Lav5;)Lzp1;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v3, v4}, Lfv0;->a(Lzp1;)V

    .line 62
    .line 63
    .line 64
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Lav5;

    .line 65
    .line 66
    invoke-static {v4}, Lzp1;->b(Lav5;)Lzp1;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v3, v4}, Lfv0;->a(Lzp1;)V

    .line 71
    .line 72
    .line 73
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lav5;

    .line 74
    .line 75
    invoke-static {v4}, Lzp1;->b(Lav5;)Lzp1;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v3, v4}, Lfv0;->a(Lzp1;)V

    .line 80
    .line 81
    .line 82
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lav5;

    .line 83
    .line 84
    invoke-static {v4}, Lzp1;->b(Lav5;)Lzp1;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v3, v4}, Lfv0;->a(Lzp1;)V

    .line 89
    .line 90
    .line 91
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Lav5;

    .line 92
    .line 93
    new-instance v5, Lzp1;

    .line 94
    .line 95
    invoke-direct {v5, v4, v2, v2}, Lzp1;-><init>(Lav5;II)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v5}, Lfv0;->a(Lzp1;)V

    .line 99
    .line 100
    .line 101
    new-instance v2, Lrf2;

    .line 102
    .line 103
    invoke-direct {v2, v1}, Lrf2;-><init>(I)V

    .line 104
    .line 105
    .line 106
    iput-object v2, v3, Lfv0;->g:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-virtual {v3}, Lfv0;->b()Lgv0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v2, "3.0.6"

    .line 113
    .line 114
    invoke-static {v0, v2}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    filled-new-array {p0, v1, v0}, [Lgv0;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0
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
