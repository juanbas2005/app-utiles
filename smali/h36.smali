.class public abstract Lh36;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lk26;

.field public static final b:Lk26;

.field public static final c:Lk26;

.field public static final d:Lk26;

.field public static final e:Lk26;

.field public static final f:Lk26;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk26;

    .line 2
    .line 3
    const-string v1, "Usted ha recibido ([\\d.]+) CUP del numero (\\d+)[.,]\\s*Saldo principal (\\S+) CUP, linea activa hasta ([^,]+), vence (.+)"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh36;->a:Lk26;

    .line 9
    .line 10
    new-instance v0, Lk26;

    .line 11
    .line 12
    const-string v1, "Usted ha transferido ([\\d.]+) CUP al numero (\\d+)[.,]\\s*Saldo principal (\\S+) CUP, linea activa hasta ([^,]+), vence (.+)"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lh36;->b:Lk26;

    .line 18
    .line 19
    new-instance v0, Lk26;

    .line 20
    .line 21
    const-string v1, "[Hh]a comprado\\s+(?:un plan(?:\\s+de)?\\s+)?(.+)"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lh36;->c:Lk26;

    .line 27
    .line 28
    new-instance v0, Lk26;

    .line 29
    .line 30
    const-string v1, "Importe:\\s*([\\d.,]+)"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lh36;->d:Lk26;

    .line 36
    .line 37
    new-instance v0, Lk26;

    .line 38
    .line 39
    const-string v1, "Importe Pagado:\\s*([\\d.,]+)"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lh36;->e:Lk26;

    .line 45
    .line 46
    new-instance v0, Lk26;

    .line 47
    .line 48
    const-string v1, "Se desconto\\s+([\\d.,]+)"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lh36;->f:Lk26;

    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public static final a(D)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string p1, "%.2f CUP"

    .line 15
    .line 16
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method public static final b(J)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "d/M/yyyy h:mm a"

    .line 4
    .line 5
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/Date;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
